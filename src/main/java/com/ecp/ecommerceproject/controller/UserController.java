package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.User;
import com.ecp.ecommerceproject.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/save")
    User saveUser (@RequestBody User user){
        return userService.saveUser(user);

    }
    @GetMapping("/all-users")
    List<User> findAllUsers (){
        return userService.findAll();

    }

    @GetMapping("/{id}")
    Optional<User> findByID(@PathVariable Long id){
        return userService.findByID(id);

    }

}
