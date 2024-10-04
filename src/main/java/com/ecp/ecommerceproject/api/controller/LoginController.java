package com.ecp.ecommerceproject.api.controller;

import com.ecp.ecommerceproject.api.DTO.Response.UserResponseDTO;
import com.ecp.ecommerceproject.api.mapper.UserDTOMapper;
import com.ecp.ecommerceproject.domain.model.User;
import com.ecp.ecommerceproject.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("api/v1/login")
public class LoginController {

    UserService userService;
    UserDTOMapper userDTOMapper;


    public LoginController (UserService userService, UserDTOMapper userDTOMapper){
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
    }

    @GetMapping("/{usersEmail}")
    UserResponseDTO authenticateUser (@PathVariable String usersEmail){
        User user = userService.findByEmail(usersEmail);
        return userDTOMapper.mapToDto(user);
    }


    @PostMapping("/")
    ResponseEntity<String> login (){
        return ResponseEntity.ok().body("OK");
    }
}
