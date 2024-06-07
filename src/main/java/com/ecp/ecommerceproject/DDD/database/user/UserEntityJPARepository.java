package com.ecp.ecommerceproject.DDD.database.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityJPARepository extends JpaRepository<UserEntity, Long> {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
