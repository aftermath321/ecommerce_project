package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.User;
import com.ecp.ecommerceproject.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {

    final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/users")
    User saveUser (@RequestBody User user){
        return userService.saveUser(user);

    }
    @GetMapping("/users")
    List<User> findAllUsers (){
        return userService.findAll();

    }

    @GetMapping("/users/{id}")
    Optional<User> findByID(@PathVariable Long id){
        return userService.findByID(id);

    }

}
