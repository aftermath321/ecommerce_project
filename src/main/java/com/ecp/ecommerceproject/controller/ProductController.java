package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.Product;
import com.ecp.ecommerceproject.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/index")
    Optional<Product> getAll(){

        return productService.findById(1L);

    }

    @PostMapping("/product")
    Product saveProduct (@RequestBody Product product){
        return productService.saveProduct(product);
    }


    @GetMapping("/product/{id}")
    Optional<Product> getByID (@PathVariable Long id){
        return productService.findById(id);

    }

}
