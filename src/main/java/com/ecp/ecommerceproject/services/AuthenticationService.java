package com.ecp.ecommerceproject.services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecp.ecommerceproject.controller.AuthenticationRequest;
import com.ecp.ecommerceproject.controller.RegisterRequest;
import com.ecp.ecommerceproject.model.AuthenticationResponse;
import com.ecp.ecommerceproject.model.MyUser;
import com.ecp.ecommerceproject.other.Role;
import com.ecp.ecommerceproject.repositories.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepo myUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    
    
public AuthenticationResponse authenticate(AuthenticationRequest request) {
    var user = MyUser.builder()
        .email(request.getEmail())
        .password(passwordEncoder.encode(request.getPassword()))
        .role(Role.USER)
        .build();

        myUserRepository.save(user);

    var jwtToken = jwtService.generateToken(user);
    return AuthenticationResponse.builder()
            .token(jwtToken)
            .build();
        
    }

public AuthenticationResponse register(RegisterRequest request) {
    authenticationManager.authenticate
        (new UsernamePasswordAuthenticationToken
            (request.getEmail(), request.getPassword()
            )
        );
    var user = myUserRepository.findByUser(request.getEmail())
    .orElseThrow();
    var jwtToken = jwtService.generateToken(user);
    return AuthenticationResponse.builder()
            .token(jwtToken)
            .build();
        
    }

}


