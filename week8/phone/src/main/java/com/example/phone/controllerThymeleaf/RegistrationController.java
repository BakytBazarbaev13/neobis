package com.example.phone.controllerThymeleaf;

import com.example.phone.dtos.UserDto;
import com.example.phone.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    public String registration(){
        return "registration";
    }

    @PostMapping
    public String saveUser(UserDto userDto){
        userRepo.save(userDto.toUser(bCryptPasswordEncoder));
        return "redirect:/login";
    }
}
