package com.ecp.ecommerceproject.DDD.domain.service;

import com.ecp.ecommerceproject.DDD.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
}
