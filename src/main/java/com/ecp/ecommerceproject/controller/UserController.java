package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.other.AuthenticationRequest;
import com.ecp.ecommerceproject.other.AuthenticationResponse;
import com.ecp.ecommerceproject.other.RegisterRequest;
import com.ecp.ecommerceproject.services.AuthenticationService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    
    final private AuthenticationService authenticationService;

    // @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    // @ResponseBody
    // ResponseTransfer loginUser (@RequestBody MyUser user){
    // String email = user.getEmail();
    // String password = user.getPassword();

    // boolean isAuthenticated = userService.verfiyUser(email, password);
    // if (isAuthenticated){
    // return new ResponseTransfer("Login Succesful!");
    // } else {
    // return new ResponseTransfer("Login failed!");
    // }
    // }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }

    @GetMapping("/test")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }

}
