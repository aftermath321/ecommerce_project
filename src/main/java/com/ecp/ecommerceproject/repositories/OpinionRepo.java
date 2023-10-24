package com.ecp.ecommerceproject.repositories;

import com.ecp.ecommerceproject.model.Opinion;
import com.ecp.ecommerceproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpinionRepo extends JpaRepository<Opinion, Long> {

    List<Opinion> findAll();


}
