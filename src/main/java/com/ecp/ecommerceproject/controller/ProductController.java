package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.Product;
import com.ecp.ecommerceproject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/index")
    Optional<Product> getAll(){

        return productService.findById(1L);

    }

    @PostMapping("/product")
    Product saveProduct (@RequestBody Product product){
        return productService.saveProduct(product);

    }

//    @GetMapping("/index")
//    public String homePage(){
//        return "index2";
//
//    }
}
