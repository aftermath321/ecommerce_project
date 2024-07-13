package com.ecp.ecommerceproject.database.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductEntityJPARepository extends JpaRepository<ProductEntity, Long> {

    @Query("SELECT p FROM ProductEntity p WHERE (:filterByNameOrDescription IS NULL OR p.name LIKE %:filterByNameOrDescription% OR p.description LIKE %:filterByNameOrDescription%)")
    Page<ProductEntity> findAll ( String filterByNameOrDescription, Pageable pageable);

}
