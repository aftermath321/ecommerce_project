package com.ecp.ecommerceproject.DDD.domain.service;

import com.ecp.ecommerceproject.DDD.api.mapper.ProductDTOMapper;
import com.ecp.ecommerceproject.DDD.domain.exceptions.ProductNotFoundException;
import com.ecp.ecommerceproject.DDD.domain.model.Product;
import com.ecp.ecommerceproject.DDD.domain.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductService {

//    Dobre miejsce na logike biznesowa

    private ProductRepository productRepository;
    private ProductDTOMapper productDTOMapper;

    public Product addProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    public List<Product> getAllProducts (int page, int size){
        return productRepository.getAllProducts(page, size);
    }
    public long countAllProducts(){
        return productRepository.countItems();
    }

    public Product updateProduct(Long id, Product product) throws ProductNotFoundException {

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

    public void deleteProduct(Long id) throws ProductNotFoundException {
        Optional<Product> product = productRepository.getProduct(id);
        if (product.isPresent()) {
            productRepository.deleteProduct(id);
        } else {
            throw new ProductNotFoundException("Product was not found");
        }
    }

    public Product getProduct(Long id) throws ProductNotFoundException {
        return productRepository.getProduct(id).orElseThrow(() -> new ProductNotFoundException("Product was not found."));
    }
}
