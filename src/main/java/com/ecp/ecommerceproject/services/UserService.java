package com.ecp.ecommerceproject.services;

import com.ecp.ecommerceproject.model.Users;
import com.ecp.ecommerceproject.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;

    }

    public List<Users> getAllUser(){
        return userRepo.findAll();
    }

    public Users saveUser (Users user){
        return userRepo.save(user);

    }

}
