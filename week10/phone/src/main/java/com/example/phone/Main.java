package com.example.phone;

import com.example.phone.models.entities.Brand;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Date now=new Date();
        System.out.println(now);
    }
}
