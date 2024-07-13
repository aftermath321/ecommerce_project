package com.ecp.ecommerceproject.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@ToString
@Getter
@Setter
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

    private String role;

    private String bio;


    public User(Long id, String username, String passwordHash, String email, LocalDate createdAt, String firstName, String lastName, LocalDate lastLogin, boolean activatedAccount, String role, String bio) {
    this.id = id;
    this.username = username;
    this.password = passwordHash;
    this.email = email;
    this.create_at = createdAt;
    this.first_name = firstName;
    this.last_name = lastName;
    this.last_login = lastLogin;
    this.activated_account = activatedAccount;
    this.role = role;
    this.bio = bio;
    }
}
