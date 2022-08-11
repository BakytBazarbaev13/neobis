package com.example.phone.controllers;

import com.example.phone.dtos.AuthResponse;
import com.example.phone.dtos.UserAuth;
import com.example.phone.dtos.UserDto;
import com.example.phone.services.UserService;
import com.example.phone.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AuthController {
    @Autowired
    private UserServiceImpl userService;
    @PostMapping("/auth")
    public ResponseEntity<?> auth(@RequestBody UserAuth userModel) {
        try {
            AuthResponse response = new AuthResponse();
            response.setToken(userService.getUserAuthenticationToken(userModel));
            return new ResponseEntity<AuthResponse>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("user")
    public ResponseEntity<String> getUser() {
        return new ResponseEntity<>("Congratulations! It works! This is User Page!", HttpStatus.OK);
    }
}
