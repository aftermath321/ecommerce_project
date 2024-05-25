package com.ecp.ecommerceproject.DDD.api.controller;

import com.ecp.ecommerceproject.DDD.api.DTO.Request.Product.ProductAddDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Request.Product.ProductUpdateDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Response.ProductDTO;
import com.ecp.ecommerceproject.DDD.api.mapper.ProductDTOMapper;
import com.ecp.ecommerceproject.DDD.domain.model.Product;
import com.ecp.ecommerceproject.DDD.domain.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("/v1/products")
public class ProductController {

    ProductService productService;
    ProductDTOMapper productDTOMapper;

    public ProductController(ProductService productService, ProductDTOMapper productDTOMapper) {
        this.productService = productService;
        this.productDTOMapper = productDTOMapper;
    }

    @GetMapping("/")
    Page<ProductDTO> getProducts(@RequestParam(defaultValue = "0", required = false) int page, @RequestParam(defaultValue = "10", required = false) int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productService.getAllProducts(pageable);
    }

    @PostMapping("/")
    ProductDTO saveProduct(@RequestBody ProductAddDTO requestBody) {
        Product product = productDTOMapper.mapToProduct(requestBody);
        product = productService.addProduct(product);
        return productDTOMapper.mapToDTO(product);
    }

    @GetMapping("/{id}")
    ProductDTO getProduct(@PathVariable Long id) {
        Optional<Product> product = productService.getProduct(id);
        return productDTOMapper.mapToDTO(product.orElse(null));
    }

    //    Sprawdzic czy id istnieje, jesli tak to nadpisac obiektem
    @PutMapping("/{id}")
    ProductDTO updateProduct(@PathVariable("id") Long id, @RequestBody ProductUpdateDTO requestBody) {
        Product product = productDTOMapper.mapToProduct(id, requestBody);
        product = productService.updateProduct(id, product);
        return productDTOMapper.mapToDTO(product);
    }

    //    Obsluga bledow, expcetion handler
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}


// /////////////////////////////////////////////
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


