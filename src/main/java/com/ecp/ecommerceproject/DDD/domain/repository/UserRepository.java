package com.ecp.ecommerceproject.DDD.domain.repository;

import com.ecp.ecommerceproject.DDD.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User addUser(User user);

    Optional<User> getUser(Long id);

    Long countUsers();

    List<User> getAllUsers(int page, int size);

    void deleteUser(Long id);

    User updateUser(User oldUser);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}
