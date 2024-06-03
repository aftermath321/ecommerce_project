package com.ecp.ecommerceproject.DDD.api.controller;

import com.ecp.ecommerceproject.DDD.api.DTO.Response.AllProductDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Response.ProductDTO;
import com.ecp.ecommerceproject.DDD.api.mapper.ProductDTOMapper;
import com.ecp.ecommerceproject.DDD.domain.exceptions.ProductNotFoundException;
import com.ecp.ecommerceproject.DDD.domain.model.Product;
import com.ecp.ecommerceproject.DDD.domain.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    AllProductDTO getProducts(@RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "10") int size) {

        List<Product> productList = productService.getAllProducts(page, size);
        List<ProductDTO> productDTOList = productList.stream().map(productDTOMapper::mapToDTO).toList();
        return new AllProductDTO(productService.countAllProducts(), productDTOList);
    }

    @PostMapping("/")
    ProductDTO saveProduct(@RequestBody ProductDTO requestBody) {
        Product product = productDTOMapper.mapToProduct(requestBody);
        product = productService.addProduct(product);
        return productDTOMapper.mapToDTO(product);
    }

    @GetMapping("/{id}")
    ProductDTO getProduct(@PathVariable Long id) throws ProductNotFoundException {

        Product product = productService.getProduct(id);
        return productDTOMapper.mapToDTO(product);
    }

    @PutMapping("/{id}")
    ProductDTO updateProduct(@PathVariable("id") Long id, @RequestBody ProductDTO requestBody) throws ProductNotFoundException {
        Product product = productDTOMapper.mapToProduct(requestBody);
        product = productService.updateProduct(id, product);
        return productDTOMapper.mapToDTO(product);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteProduct(@PathVariable Long id) {

        try{
            productService.deleteProduct(id);
            return ResponseEntity.status(200).body("Deleted.");
        }
        catch (ProductNotFoundException exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
        }
        catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }

    }
}




