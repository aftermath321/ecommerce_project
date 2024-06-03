package com.ecp.ecommerceproject.DDD.domain.repository;

import com.ecp.ecommerceproject.DDD.domain.model.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductRepository  {
    
    Product saveProduct(Product product);

    List<Product> getAllProducts (int page, int size);

    Product updateProduct(Product product);

    void deleteProduct (Long id);

    Optional<Product> getProduct(Long id);

    long countItems();
}
