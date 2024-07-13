package com.ecp.ecommerceproject.domain.service;

import com.ecp.ecommerceproject.domain.exceptions.ProductNotFoundException;
import com.ecp.ecommerceproject.domain.model.Product;
import com.ecp.ecommerceproject.domain.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductService {


    private ProductRepository productRepository;
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    public Product addProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    public List<Product> getAllProducts (int page, int size, String filterByNameOrDescription){
        return productRepository.getAllProducts(page, size, filterByNameOrDescription);
    }
    public long countAllProducts(){
        return productRepository.countItems();
    }

    public Product updateProduct(Long id, Product product)  {

        if (product == null) {
            throw new IllegalArgumentException("Product can not be null");
        }

        Product oldProduct = productRepository.getProduct(id).orElseThrow(() -> new ProductNotFoundException("Product was not found."));

        if (product.getDescription() != null) {
            oldProduct.setDescription(product.getDescription());
        }
        if (product.getName() != null) {
            oldProduct.setName(product.getName());
        }
        if (product.getPrice() != null) {
            oldProduct.setPrice(product.getPrice());
        }

        oldProduct.setQuantityAvailable(product.getQuantityAvailable());

        return productRepository.updateProduct(oldProduct);

    }

    public void deleteProduct(Long id) {
        Optional<Product> product = productRepository.getProduct(id);

        if (product.isPresent()) {
            productRepository.deleteProduct(id);
        } else {
            throw new ProductNotFoundException("Product was not found");
        }
    }

    public Product getProduct(Long id) {
        logger.debug("Getting product with id: {}", id);
        Product product = productRepository.getProduct(id).orElseThrow(() -> new ProductNotFoundException("Product was not found."));
        logger.info("Product found: {}", product);
        return product;
    }
}
