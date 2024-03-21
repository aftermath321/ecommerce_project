package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.User;
import com.ecp.ecommerceproject.other.ResponseTransfer;
import com.ecp.ecommerceproject.services.UserService;

import org.springframework.http.MediaType;
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
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseTransfer loginUser (@RequestBody User user){
        String email = user.getEmail();
        String password = user.getPassword();

        boolean isAuthenticated = userService.verfiyUser(email, password);
        if (isAuthenticated){
            return new ResponseTransfer("Login Succesful!");
        } else {
            return new ResponseTransfer("Login failed!");
        }
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
