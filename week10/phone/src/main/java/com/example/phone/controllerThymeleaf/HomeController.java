package com.example.phone.controllerThymeleaf;

import com.example.phone.dtos.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/roleUser")
    public String forUser(){
        return "user";
    }

    @GetMapping("/roleAdmin")
    public String forAdmin(){
        return "admin";
    }

    @PostMapping("/auth")
    @ResponseBody
    public String getToken(@RequestBody UserDto userDto){
        return null;
    }
}
