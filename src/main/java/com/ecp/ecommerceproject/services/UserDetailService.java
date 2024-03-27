package com.ecp.ecommerceproject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;


import com.ecp.ecommerceproject.model.MyUser;
import com.ecp.ecommerceproject.repositories.UserRepo;

@Service
public class UserDetailService implements UserDetailsService{


    @Autowired
        private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> user = userRepo.findByUsername(username);

        if(user.isPresent()){
            var userObj = user.get();
            		 return User.builder()
                     .username(userObj.getEmail())
                     .password(userObj.getPassword())
                     .roles(getRole(userObj))
                     .build();

        } else {
            throw new UsernameNotFoundException(username);
        }
    }


     private String[] getRole(MyUser user) {
        if (user.getRole() == null) {
            return new String[]{"USER"};
        }
        return user.getRole().split(",");
    }

}
