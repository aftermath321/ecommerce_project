package com.ecp.ecommerceproject.DDD.domain.service;

import org.springframework.stereotype.Service;

import com.ecp.ecommerceproject.DDD.domain.model.Product;
import com.ecp.ecommerceproject.DDD.domain.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductService {

//    Dobre miejsce na logike biznesowa

    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    };

    public Product updateProduct(Long id, Product product) {
        Optional<Product> oldProduct = productRepository.getProduct(id);
        System.out.println(oldProduct);
        oldProduct.get().setDescription(product.getDescription());
        oldProduct.get().setName(product.getName());
        oldProduct.get().setPrice(product.getPrice());
        oldProduct.get().setQuantityAvailable(product.getQuantityAvailable());
        System.out.println(oldProduct);
        return productRepository.updateProduct(oldProduct.get());
    }

    public void deleteProduct(long id) {
        productRepository.deleteProduct(id);
    }

    public Optional<Product> getProduct(Long id) {
        return productRepository.getProduct(id);
    }
}
