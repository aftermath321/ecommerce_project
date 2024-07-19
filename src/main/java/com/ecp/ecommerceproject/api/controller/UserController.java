package com.ecp.ecommerceproject.api.controller;

import com.ecp.ecommerceproject.api.DTO.Request.User.UserRequestDTO;
import com.ecp.ecommerceproject.api.DTO.Response.PageableDTO;
import com.ecp.ecommerceproject.api.DTO.Response.UserResponseDTO;
import com.ecp.ecommerceproject.api.mapper.UserDTOMapper;
import com.ecp.ecommerceproject.domain.service.UserService;
import com.ecp.ecommerceproject.domain.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("api/v1/users")
public class UserController {

    UserService userService;
    UserDTOMapper userDTOMapper;

    public UserController (UserService userService, UserDTOMapper userDTOMapper){
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping("/")
    UserResponseDTO saveUser (@RequestBody UserRequestDTO userRequestDTO) {
        User user = userDTOMapper.mapToUser(userRequestDTO);
        user = userService.addUser(user);
        return userDTOMapper.mapToDto(user);
    }

    @GetMapping("/{id}")
    UserResponseDTO getUser (@PathVariable Long id) {
        User user = userService.getUser(id);
        return userDTOMapper.mapToDto(user);
    }

    @GetMapping("/")
    PageableDTO getAllUsers(@RequestParam(defaultValue = "0") int page,
                            @RequestParam(defaultValue = "10") int size
                            ){
        List<User> userList = userService.getAllUsers(page, size);
        List<UserResponseDTO> userDTOList = userList.stream().map(userDTOMapper::mapToDto).toList();
        return new PageableDTO(userService.countUsers(), userDTOList);

    }

    @GetMapping("/security/{usersEmail}")
    UserResponseDTO authenticateUser (@PathVariable String usersEmail){
        User user = userService.findByEmail(usersEmail);
        return userDTOMapper.mapToDto(user);
    }

    @DeleteMapping("/{id}")
    HttpStatus deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);
        return HttpStatus.OK;
    }

    @PutMapping("/{id}")
    UserResponseDTO updateUser(@PathVariable Long id, @RequestBody UserRequestDTO userRequestDTO){

        User user = userDTOMapper.mapToUser(userRequestDTO);
        user = userService.updateUser(id, user);
        return userDTOMapper.mapToDto(user);
    }




}
