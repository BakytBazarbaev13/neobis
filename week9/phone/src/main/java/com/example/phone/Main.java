package com.example.phone;

import com.example.phone.models.entities.Brand;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        Brand brand=new Brand("Samsung");
        String e=objectMapper.writeValueAsString(brand);
        System.out.println(e);
    }
}
