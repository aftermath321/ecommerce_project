package com.ecp.ecommerceproject.repositories;

import com.ecp.ecommerceproject.model.MyUser;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<MyUser, Long> {

    @Query("SELECT u FROM MyUser u WHERE u.email = :email")
    MyUser findByEmail(@Param("email") String email);

    Optional<MyUser> findByUsername(String email);
}
