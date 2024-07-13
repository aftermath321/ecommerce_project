package com.ecp.ecommerceproject.database.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "user_entity")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password_hash;

    @Column(nullable = false, unique = true)
    private String email;

    private String first_name;

    private String last_name;

    private LocalDate created_at;

    private LocalDate last_login;

    private boolean activated_account;

    private String role;

    private String bio;



}
