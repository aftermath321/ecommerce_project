package com.ecp.ecommerceproject.other;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public enum Role {
    USER,
    ADMIN;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }
}