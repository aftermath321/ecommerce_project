package com.ecp.ecommerceproject.DDD.api.controller;

import com.ecp.ecommerceproject.DDD.api.DTO.Response.AllUserDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Response.UserDTO;
import com.ecp.ecommerceproject.DDD.api.mapper.UserDTOMapper;
import com.ecp.ecommerceproject.DDD.domain.exceptions.UserNotFoundException;
import com.ecp.ecommerceproject.DDD.domain.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecp.ecommerceproject.DDD.domain.model.User;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("/v1/users")
public class UserController {

    UserService userService;
    UserDTOMapper userDTOMapper;

    public UserController (UserService userService, UserDTOMapper userDTOMapper){
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping("/")
    UserDTO saveUser (@RequestBody UserDTO requestBody){
        User user = userDTOMapper.mapToUser(requestBody);
        user = userService.addUser(user);
        return userDTOMapper.mapToDto(user);
    }

    @GetMapping("/{id}")
    UserDTO getUser (@PathVariable Long id) throws UserNotFoundException {
        User user = userService.getUser(id);
        return userDTOMapper.mapToDto(user);
    }

    @GetMapping("/")
    AllUserDTO getAllUsers(@RequestParam(defaultValue = "0") int page,
                           @RequestParam(defaultValue = "10") int size){
        List<User> userList = userService.getAllUsers(page, size);
        List<UserDTO> userDTOList = userList.stream().map(userDTOMapper::mapToDto).toList();
        return new AllUserDTO(userDTOList, userService.countUsers());

    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteUser(@PathVariable Long id){
        try{
            userService.deleteUser(id);
            return ResponseEntity.status(200).body("Deleted");
        } catch (UserNotFoundException exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
        } catch (Exception exception){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }

    @PutMapping("/{id}")
    UserDTO updateUser(@PathVariable Long id, @RequestBody UserDTO requestBody) throws UserNotFoundException{
        User user = userDTOMapper.mapToUser(requestBody);
        user = userService.updateUser(id, user);
        return userDTOMapper.mapToDto(user);
    }




}
