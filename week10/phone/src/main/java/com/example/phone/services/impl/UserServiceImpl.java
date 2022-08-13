package com.example.phone.services.impl;

import com.example.phone.models.entities.Role;
import com.example.phone.models.entities.User;
import com.example.phone.repositories.UserRepo;
import com.example.phone.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private UserRepo userRepo;
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    public UserServiceImpl(UserRepo userRepo, BCryptPasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }


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
    public User saveUser(User user) {
        user.setRoles(Collections.singleton(Role.USER));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public User findByUsername(String username){
        return userRepo.findByUsername(username);
    }

    public User findByUsernameAndPassword(String username,String password){
        User user=findByUsername(username);
        if (user != null){
            if (passwordEncoder.matches(password,user.getPassword())){
                return user;
            }
        }
        return null;
    }
}
