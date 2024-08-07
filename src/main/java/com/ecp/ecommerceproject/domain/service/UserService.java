package com.ecp.ecommerceproject.domain.service;

import com.ecp.ecommerceproject.domain.exceptions.EmailException;
import com.ecp.ecommerceproject.domain.exceptions.UserNotFoundException;
import com.ecp.ecommerceproject.domain.exceptions.UsernameException;
import com.ecp.ecommerceproject.domain.model.User;
import com.ecp.ecommerceproject.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
@AllArgsConstructor
public class UserService {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final String USERNAME_REGEX = "^[A-Za-z0-9._-]{3,20}$";
    private static final Pattern USERNAME_PATTERN = Pattern.compile(USERNAME_REGEX);
    private UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);


    public User addUser(User user)  {
        if (validateAndCheckEmail(user.getEmail()) && validateAndCheckUsername(user.getUsername())) {
            return userRepository.addUser(user);
        } else {
            return null;
        }
    }

    public User getUser(Long id)  {
        return userRepository.getUser(id).orElseThrow(() -> new UserNotFoundException("User with id " + id + " was not found."));
    }

    public User findByEmail(String usersEmail) {
        return userRepository.findByEmail(usersEmail).orElseThrow (() -> new UserNotFoundException("No user with such email exists."));
    }

    public Long countUsers() {
        return userRepository.countUsers();
    }

    public List<User> getAllUsers(int page, int size) {
        return userRepository.getAllUsers(page, size);
    }

    public void deleteUser(Long id) {

        Optional<User> user = userRepository.getUser(id);
        if (user.isPresent()) {
            userRepository.deleteUser(id);
        } else {
            throw new UserNotFoundException("User was not found.");
        }

    }

    public User updateUser(Long id, User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        User oldUser = userRepository.getUser(id).orElseThrow(() -> new UserNotFoundException("User was not found."));

        if (user.getPassword() != null) {
            oldUser.setPassword(user.getPassword());
        }
        if (user.getUsername() != null) {
            oldUser.setUsername(user.getUsername());
        }
        if (user.getBio() != null) {
            oldUser.setBio(user.getBio());
        }
        if (user.getFirst_name() != null) {
            oldUser.setFirst_name(user.getFirst_name());
        }
        if (user.getLast_name() != null) {
            oldUser.setLast_name(user.getLast_name());
        }
        if (user.getEmail() != null) {
            oldUser.setEmail(user.getEmail());
        }
        if (validateAndCheckEmail(oldUser.getEmail()) && validateAndCheckUsername(oldUser.getEmail())) {
            return userRepository.addUser(oldUser);
        } else {
            return null;
        }

    }

    public boolean isUsernameValid(String username) {
        return USERNAME_PATTERN.matcher(username).matches();
    }

    public boolean isUsernameUnique(String username) {
        return !userRepository.existsByUsername(username);
    }

    public boolean validateAndCheckUsername(String username) {
        if(isUsernameValid(username) && isUsernameUnique(username)){
            return true;
        } else {
            throw new UsernameException("Please enter different, correct username.");
        }
    }

    public boolean isEmailValid(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public boolean isEmailUnique(String email) {
        return !userRepository.existsByEmail(email);
    }

    public boolean validateAndCheckEmail(String email) {
        if(isEmailValid(email) && isEmailUnique(email)) {
            return true;
        } else {
            throw new EmailException("Please enter different, correct email.");
        }
    }



}
