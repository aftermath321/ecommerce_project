//package com.ecp.ecommerceproject.services;
//
//import com.ecp.ecommerceproject.application.repositories.ProductRepo;
//import com.ecp.ecommerceproject.domain.entity.Product;
//
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProductService {
//
//    private final ProductRepo productRepo;
//
//    public ProductService(ProductRepo productRepo) {
//        this.productRepo = productRepo;
//    }
//
//    public List<Product> getAllProducts() {
//
//        return productRepo.findAll();
//    }
//
//    public Optional<Product> findById(Long id) {
//        return productRepo.findById(id);
//
//    }
//
//    public Product saveProduct(Product product) {
//        return productRepo.save(product);
//
//    }
//
//    public List<Product> findByName(String phrase) {
//        return productRepo.findProductByName(phrase);
//
//    }
//
//    public List<Product> getProductsForGrid() {
//        return productRepo.findProductsTop6();
//    }
//
//    public Optional<List<Product>> searchProduct(String phrase) {
//        return productRepo.searchByPhrase(phrase);
//    }
//}
