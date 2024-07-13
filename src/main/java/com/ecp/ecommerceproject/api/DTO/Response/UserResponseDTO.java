package com.ecp.ecommerceproject.api.DTO.Response;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserResponseDTO {

    private Long id;
    private String username;
    private String password;
    private String email;
    private LocalDate create_at;

    private String first_name;

    private String last_name;

    private LocalDate last_login;

    private boolean activated_account;

    private String role;

    private String bio;

    public UserResponseDTO(Long id, String username, String password, String email, LocalDate create_at, String first_name, String last_name, LocalDate last_login, boolean activated_account, String role, String bio) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.create_at = create_at;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_login = last_login;
        this.activated_account = activated_account;
        this.role = role;
        this.bio = bio;
    }
}
