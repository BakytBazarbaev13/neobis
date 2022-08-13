package com.example.phone.jwt;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
