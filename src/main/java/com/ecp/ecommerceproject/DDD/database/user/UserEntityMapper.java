package com.ecp.ecommerceproject.DDD.database.user;

import com.ecp.ecommerceproject.DDD.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {

    public UserEntity mapToEntity(User user) {
        return new UserEntity(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getFirst_name(),
                user.getLast_name(),
                user.getCreate_at(),
                user.getLast_login(),
                user.isActivated_account(),
                user.getRole(),
                user.getBio()
        );
    }

    public User mapToUser(UserEntity userEntity) {
        return new User(
                userEntity.getId(),
                userEntity.getUsername(),
                userEntity.getPassword_hash(),
                userEntity.getEmail(),
                userEntity.getCreated_at(),
                userEntity.getFirst_name(),
                userEntity.getLast_name(),
                userEntity.getLast_login(),
                userEntity.isActivated_account(),
                userEntity.getRole(),
                userEntity.getBio()
        );
    }
}
