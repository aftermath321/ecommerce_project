package com.ecp.ecommerceproject.api.controller;

import com.ecp.ecommerceproject.api.DTO.Request.Product.ProductRequestDTO;
import com.ecp.ecommerceproject.api.DTO.Response.PageableDTO;
import com.ecp.ecommerceproject.api.DTO.Response.ProductResponseDTO;
import com.ecp.ecommerceproject.api.mapper.ProductDTOMapper;
import com.ecp.ecommerceproject.domain.model.Product;
import com.ecp.ecommerceproject.domain.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("/api/v1/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();
    static {
        objectMapper.registerModule(new JavaTimeModule());
    }

    ProductService productService;
    ProductDTOMapper productDTOMapper;

    public ProductController(ProductService productService, ProductDTOMapper productDTOMapper) {
        this.productService = productService;
        this.productDTOMapper = productDTOMapper;
    }

    @GetMapping("/")
    PageableDTO getProducts(@RequestParam(defaultValue = "0") int page,
                            @RequestParam(defaultValue = "10") int size,
                            @RequestParam (required = false) String filterByNameOrDescription) {
        List<Product> productList = productService.getAllProducts(page, size, filterByNameOrDescription);
        List<ProductResponseDTO> productDTOList = productList.stream().map(productDTOMapper::mapToDTO).toList();
        return new PageableDTO(productService.countAllProducts(), productDTOList);
    }

    @PostMapping("/")
    ProductResponseDTO saveProduct(@RequestBody ProductRequestDTO requestBody) {
          Product product = productDTOMapper.mapToProduct(requestBody);
        product = productService.addProduct(product);
        return productDTOMapper.mapToDTO(product);
    }

    @GetMapping("/{id}")
    ProductResponseDTO getProduct(@PathVariable Long id){

        Product product = productService.getProduct(id);
        return productDTOMapper.mapToDTO(product);
    }

    @PutMapping("/{id}")
    ProductResponseDTO updateProduct(@PathVariable("id") Long id, @RequestBody ProductRequestDTO productRequestDTO){
        Product product = productDTOMapper.mapToProduct(productRequestDTO);
        product = productService.updateProduct(id, product);
        return productDTOMapper.mapToDTO(product);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteProduct(@PathVariable Long id) {


            productService.deleteProduct(id);
            return ResponseEntity.status(200).body("Deleted.");



    }
}




