package com.example.phone.services;

import com.example.phone.dtos.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    String saveUser(UserDto userDto);
}

