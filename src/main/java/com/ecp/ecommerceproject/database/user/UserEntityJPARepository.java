package com.ecp.ecommerceproject.database.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface UserEntityJPARepository extends JpaRepository<UserEntity, Long> {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    @Query("SELECT u FROM UserEntity u WHERE  u.email = :usersEmail")
    Optional<UserEntity> findByEmail (String usersEmail);
}
