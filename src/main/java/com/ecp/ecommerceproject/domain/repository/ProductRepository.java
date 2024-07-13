package com.ecp.ecommerceproject.domain.repository;

import com.ecp.ecommerceproject.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository  {
    
    Product saveProduct(Product product);

    List<Product> getAllProducts (int page, int size, String filterByNameOrDescription);

    Product updateProduct(Product product);

    void deleteProduct (Long id);

    Optional<Product> getProduct(Long id);

    long countItems();
}
