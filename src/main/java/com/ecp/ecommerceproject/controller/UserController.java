package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.Users;
import com.ecp.ecommerceproject.repositories.UserRepo;
import com.ecp.ecommerceproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/users")
    Users saveUser (@RequestBody Users user){
        return userRepo.save(user);

    }
    @GetMapping("/users")
    List<Users> findAllUsers (){
        return userRepo.findAll();

    }

}
