package com.ecp.ecommerceproject.api.mapper;

import com.ecp.ecommerceproject.api.DTO.Request.User.UserRequestDTO;
import com.ecp.ecommerceproject.api.DTO.Response.UserResponseDTO;
import com.ecp.ecommerceproject.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {


    public UserResponseDTO mapToDto (User user){
        return new UserResponseDTO(
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

    public User mapToUser (UserRequestDTO userRequestDTO){
        return new User(
                null,
                userRequestDTO.getUsername(),
                userRequestDTO.getPassword(),
                userRequestDTO.getEmail(),
                userRequestDTO.getCreate_at(),
                userRequestDTO.getFirst_name(),
                userRequestDTO.getLast_name(),
                userRequestDTO.getLast_login(),
                userRequestDTO.isActivated_account(),
                userRequestDTO.getRole(),
                userRequestDTO.getBio()
        );
    }

}
