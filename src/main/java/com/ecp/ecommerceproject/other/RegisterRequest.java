package com.ecp.ecommerceproject.other;

import com.ecp.ecommerceproject.DDD.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class RegisterRequest {

    private String email;
    private String password;
    private String username;
    private Role role;
    

}
