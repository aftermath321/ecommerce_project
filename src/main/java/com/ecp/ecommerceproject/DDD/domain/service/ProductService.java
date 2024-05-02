package com.ecp.ecommerceproject.DDD.domain.service;

import org.springframework.stereotype.Service;

import com.ecp.ecommerceproject.DDD.domain.model.Product;
import com.ecp.ecommerceproject.DDD.domain.repository.ProductRepository;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductService  {

    private ProductRepository productRepository;

    public Product addProduct (Product product){
       return productRepository.saveProduct(product);
    }

    public List<Product> getAllProducts(){
      return productRepository.getAllProducts();
    };

}
