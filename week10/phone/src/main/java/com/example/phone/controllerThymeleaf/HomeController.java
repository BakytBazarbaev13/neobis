package com.example.phone.controllerThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
