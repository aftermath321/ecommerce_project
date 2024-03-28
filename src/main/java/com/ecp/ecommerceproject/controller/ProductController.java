package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.Product;
import com.ecp.ecommerceproject.services.ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("/product")
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/all-products")
    List<Product> getAll(){

        return productService.getAllProducts();

    }

    @PostMapping("/save")
    Product saveProduct (@RequestBody Product product){
        return productService.saveProduct(product);
    }


    @GetMapping("/lookup")
    List<Product> findByName (@RequestParam String phrase){
        return productService.findByName(phrase);

    }

    @GetMapping("/{id}")
    Optional<Product> getByID (@PathVariable Long id){
        return productService.findById(id);

    }

    @GetMapping("/search")
    ResponseEntity<List<Product>> searchProducts(@RequestParam("phrase") String phrase){
        Optional<List<Product>> searchResult = productService.searchProduct(phrase);
         if (searchResult.isPresent()) {
            return ResponseEntity.ok(searchResult.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No products found with the provided phrase");
        }
    }

}
