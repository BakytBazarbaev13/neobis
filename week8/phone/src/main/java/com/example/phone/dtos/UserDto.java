package com.example.phone.dtos;

import com.example.phone.models.entities.Role;
import com.example.phone.models.entities.User;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collections;

@Data
public class UserDto {
    private String username;
    private String password;
    public User toUser(BCryptPasswordEncoder bCryptPasswordEncoder) {
      User user=new User();
      user.setUsername(username);
      user.setPassword(bCryptPasswordEncoder.encode(password));
      user.setRoles(Collections.singleton(Role.USER));
        return user;
    }
}
