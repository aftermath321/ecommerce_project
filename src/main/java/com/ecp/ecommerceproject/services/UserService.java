package com.ecp.ecommerceproject.services;

import com.ecp.ecommerceproject.model.MyUser;
import com.ecp.ecommerceproject.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;

    }


    public MyUser saveUser (MyUser user){
        return userRepo.save(user);
    }

    public Optional<MyUser> findByID (Long id){
        return userRepo.findById(id);
    }

    public List<MyUser> findAll (){
        return userRepo.findAll();

    }


}
