package com.ecp.ecommerceproject.DDD.database.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductEntityJPARepository extends JpaRepository<ProductEntity, Long> {

    void delete(ProductEntity productEntity);


//    List<ProductEntity> findAll();
//
//    Optional<ProductEntity> findProductById(Long id);
//
//    List<ProductEntity> findProductByName(String name);
//
//    Optional<ProductEntity> findProductByProducer(String producer);
//
//    Optional<ProductEntity> findProductByPrice(double price);
//
//    Optional<ProductEntity> findProductByReleased(Date date);

//    @Query(value = "SELECT * FROM Product ORDER BY price DESC limit 10")
//    List<ProductEntity> findProductsTop6();
//
//    @Query("SELECT p FROM Product p WHERE p.name LIKE %:phrase% OR p.producer LIKE %:phrase%")
//    Optional<List<ProductEntity>> searchByPhrase(@Param("phrase") String phrase);

}
