package com.ecp.ecommerceproject.repositories;

import com.ecp.ecommerceproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findAll();
    Optional<Product> findProductById(Long id);
    Optional<Product> findProductByName(String name);
    Optional<Product> findProductByProducer(String producer);
    Optional<Product> findProductByPrice(double price);
    Optional<Product> findProductByReleased(Date date);
    Optional<Product> findProductByRating(double rating);


}
