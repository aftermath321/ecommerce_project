package com.ecp.ecommerceproject.DDD.api.controller;

import com.ecp.ecommerceproject.DDD.api.DTO.Request.ProductAddDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Request.ProductDeleteDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Request.ProductUpdateDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Response.ProductDTO;
import com.ecp.ecommerceproject.DDD.api.mapper.ProductDTOMapper;
import com.ecp.ecommerceproject.DDD.domain.service.ProductService;
import com.ecp.ecommerceproject.DDD.domain.model.Product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("/product")
public class ProductController {

    ProductService productService;
    ProductDTOMapper productDTOMapper;

    public ProductController(ProductService productService, ProductDTOMapper productDTOMapper) {
        this.productService = productService;
        this.productDTOMapper = productDTOMapper;
    }



     @GetMapping("/all-products")
     List<ProductDTO> getAll() {

         List<Product> productList = productService.getAllProducts();
         return productList.stream()
                 .map(productDTOMapper::mapToDTO)
                 .collect(Collectors.toList());
     }

    @PostMapping("/save")
    ProductDTO saveProduct(@RequestBody ProductAddDTO requestBody) {
        Product product = productDTOMapper.mapToProduct(requestBody);
        product = productService.addProduct(product);
        return productDTOMapper.mapToDTO(product);
    }

    @PutMapping("/update")
    ProductDTO updateProduct (@RequestBody ProductUpdateDTO requestBody){
        Product product = productDTOMapper.mapToProduct(requestBody);
        product = productService.updateProduct(product);
        return productDTOMapper.mapToDTO(product);
    }

    @PutMapping("/delete")
        ResponseEntity<String> deleteProduct (@RequestBody ProductDeleteDTO requestBody){
            Product product = productDTOMapper.mapToProduct(requestBody);
            productService.deleteProduct(product);
            return ResponseEntity.noContent().build();
            }
    }


    // 
//    @GetMapping("/lookup")
//    List<Product> findByName(@RequestParam String phrase) {
//        return productService.findByName(phrase);
//
//    }

//    @GetMapping("/{id}")
//    Optional<Product> getByID(@PathVariable Long id) {
//        return productService.findById(id);
//
//    }

//    @GetMapping("/search")
//    ResponseEntity<List<Product>> searchProducts(@RequestParam("phrase") String phrase) {
//        Optional<List<Product>> searchResult = productService.searchProduct(phrase);
//        if (searchResult.isPresent()) {
//            return ResponseEntity.ok(searchResult.get());
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No products found with the provided phrase");
//        }
//    }


