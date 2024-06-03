package com.ecp.ecommerceproject.DDD.api.DTO.Request.User;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserAddDTO {

    private String username;
    private String password;
    private String email;
    private LocalDate create_at;

    private String first_name;

    private String last_name;

    private boolean activated_account;

    private String role;


    public UserAddDTO(String username, String password, String email, String first_name, String last_name, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.create_at = LocalDate.now();
        this.first_name = first_name;
        this.last_name = last_name;
        this.activated_account = false;
        this.role = role;
    }
}
