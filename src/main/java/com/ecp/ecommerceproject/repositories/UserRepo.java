package com.ecp.ecommerceproject.repositories;

import com.ecp.ecommerceproject.model.MyUser;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByUsername(String username);

    Optional<MyUser> findByEmail(String email);
}
