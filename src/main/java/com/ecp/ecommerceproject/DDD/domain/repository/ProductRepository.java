package com.ecp.ecommerceproject.DDD.domain.repository;

import com.ecp.ecommerceproject.DDD.domain.model.Product;

import java.util.List;

public interface ProductRepository  {
    
    Product saveProduct(Product product);

    List<Product> getAllProducts ();

}
