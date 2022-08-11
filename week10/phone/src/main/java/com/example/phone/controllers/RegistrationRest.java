package com.example.phone.controllers;

import com.example.phone.dtos.UserDto;
import com.example.phone.services.UserService;
import com.example.phone.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RegistrationRest {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/saveUser")
    public String save(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

}
