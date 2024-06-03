package com.ecp.ecommerceproject.DDD.api.mapper;

import com.ecp.ecommerceproject.DDD.api.DTO.Response.UserDTO;
import com.ecp.ecommerceproject.DDD.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {


    public UserDTO mapToDto (User user){
        return new UserDTO(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getCreate_at(),
                user.getFirst_name(),
                user.getLast_name(),
                user.getLast_login(),
                user.isActivated_account(),
                user.getRole(),
                user.getBio()
        );
    }

    public User mapToUser (UserDTO userDTO){
        return new User(
                null,
                userDTO.getUsername(),
                userDTO.getPassword(),
                userDTO.getEmail(),
                userDTO.getCreate_at(),
                userDTO.getFirst_name(),
                userDTO.getLast_name(),
                userDTO.getLast_login(),
                userDTO.isActivated_account(),
                userDTO.getRole(),
                userDTO.getBio()
        );
    }

}
