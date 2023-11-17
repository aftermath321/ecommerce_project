package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.Product;
import com.ecp.ecommerceproject.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/all-products")
    List<Product> getAll(){

        return productService.getProductsForGrid();

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


}
