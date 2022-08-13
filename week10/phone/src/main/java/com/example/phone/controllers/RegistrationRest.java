package com.example.phone.controllers;

import com.example.phone.jwt.AuthResponse;
import com.example.phone.jwt.JwtProvider;
import com.example.phone.models.entities.User;
import com.example.phone.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RegistrationRest {
    private UserServiceImpl userService;
    private JwtProvider jwtProvider;
    @Autowired
    public RegistrationRest(UserServiceImpl userService, JwtProvider jwtProvider) {
        this.userService = userService;
        this.jwtProvider = jwtProvider;
    }

    @PostMapping("/reg")
    public User save(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/auth")
    public AuthResponse auth(@RequestBody User user){
        userService.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        String token=jwtProvider.generateToken(user.getUsername());
        return new AuthResponse(token);
    }

}
