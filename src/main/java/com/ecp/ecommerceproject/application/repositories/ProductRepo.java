package com.ecp.ecommerceproject.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecp.ecommerceproject.domain.entity.Product;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findAll();

    Optional<Product> findProductById(Long id);

    List<Product> findProductByName(String name);

    Optional<Product> findProductByProducer(String producer);

    Optional<Product> findProductByPrice(double price);

    Optional<Product> findProductByReleased(Date date);

    @Query(value = "SELECT * FROM Product ORDER BY price DESC limit 10", nativeQuery = true)
    List<Product> findProductsTop6();

    @Query("SELECT p FROM Product p WHERE p.name LIKE %:phrase% OR p.producer LIKE %:phrase%")
    Optional<List<Product>> searchByPhrase(@Param("phrase") String phrase);

}
