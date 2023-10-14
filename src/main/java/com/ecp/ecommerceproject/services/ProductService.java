package com.ecp.ecommerceproject.services;

import com.ecp.ecommerceproject.model.Product;
import com.ecp.ecommerceproject.repositories.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Optional<Product> findById(Long id){
        return productRepo.findById(id);

    }

    public Product saveProduct (Product product){
       return productRepo.save(product);

    }

}
