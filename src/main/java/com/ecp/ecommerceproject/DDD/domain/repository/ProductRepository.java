package com.ecp.ecommerceproject.DDD.domain.repository;

import com.ecp.ecommerceproject.DDD.domain.model.Product;


public interface ProductRepository  {
    
    Product saveProduct(Product product);

}
