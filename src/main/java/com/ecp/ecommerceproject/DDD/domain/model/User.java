package com.ecp.ecommerceproject.DDD.domain.model;

import com.ecp.ecommerceproject.DDD.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class User {

    @Nullable
    private Long id;
    @Nullable
    private String username;
    @Nullable
    private String password;
    @Nullable
    private String email;
    @Nullable
    private LocalDate create_at;

    @Nullable
    private String first_name;

    private String last_name;

    @Nullable
    private LocalDate last_login;

    private boolean activated_account;

    private Role role;



}
