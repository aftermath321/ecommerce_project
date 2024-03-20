package com.ecp.ecommerceproject.services;

import com.ecp.ecommerceproject.model.User;
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


    public User saveUser (User user){
        return userRepo.save(user);
    }

    public Optional<User> findByID (Long id){
        return userRepo.findById(id);
    }

    public List<User> findAll (){
        return userRepo.findAll();

    }

    public boolean verfiyUser(String email, String password)
    {
        User user = userRepo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)){
            return true;
        } else {
            return false;
        }
    }
}
