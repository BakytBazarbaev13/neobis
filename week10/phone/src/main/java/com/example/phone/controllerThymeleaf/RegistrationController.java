package com.example.phone.controllerThymeleaf;

import com.example.phone.dtos.UserDto;
import com.example.phone.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private UserService userService;
    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public String registration(){
        return "registration";
    }

    @PostMapping
    public String saveUser(UserDto user){
       userService.saveUser(user);
        return "redirect:/login";
    }
}