//package com.ecp.ecommerceproject.application.repositories;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.ecp.ecommerceproject.domain.entity.Opinion;
//import com.ecp.ecommerceproject.domain.entity.Product;
//
//import java.util.List;
//
//@Repository
//public interface OpinionRepo extends JpaRepository<Opinion, Product> {
//
//    List<Opinion> findAll();
//
//    @Query("SELECT o FROM Opinion o WHERE o.product = :product")
//    List<Opinion> findByProductID(@Param("product") Product product);
//}
