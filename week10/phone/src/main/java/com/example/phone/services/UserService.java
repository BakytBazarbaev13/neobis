package com.example.phone.services;

import com.example.phone.models.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User saveUser(User user);
    public User findByUsername(String username);
    public User findByUsernameAndPassword(String username,String password);
}

