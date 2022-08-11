package com.example.phone.services.impl;

import com.example.phone.dtos.UserAuth;
import com.example.phone.dtos.UserDto;
import com.example.phone.jwt.JwtProvider;
import com.example.phone.models.entities.User;
import com.example.phone.repositories.UserRepo;
import com.example.phone.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username);
        if(user == null) {
            log.error("User not found in the database");
            throw new UsernameNotFoundException("User not found in the database");
        } else {
            log.info("User found in the database: {}", username);
            return user;
        }
    }


    @Override
    public String saveUser(UserDto userDto) {
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        User user=userRepo.findByUsername(userDto.getUsername());
        if (user!=null){
            throw new UsernameNotFoundException("Это имя пользователя существует");
        }else {
            userRepo.save(userDto.toUser(passwordEncoder));
        }

        return "create";
    }

    public String getUserAuthenticationToken(UserAuth userAuth){
        UserAuth authModel = findByUsernameAndPassword(userAuth.getUsername(), userAuth.getPassword());
        return jwtProvider.generateToken(authModel.getUsername());
    }

    public UserAuth findByUsername(String username) {
        User user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }
        UserAuth userModel = new UserAuth();
        userModel.setUsername(user.getUsername());
        userModel.setPassword(user.getPassword());
        return userModel;
    }

    public UserAuth findByUsernameAndPassword(String username, String password) {
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        UserAuth userAuthModel = findByUsername(username);
        if (userAuthModel != null) {
            if (passwordEncoder.matches(password, userAuthModel.getPassword())) {
                return userAuthModel;
            }
        }
        return null;
    }
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
