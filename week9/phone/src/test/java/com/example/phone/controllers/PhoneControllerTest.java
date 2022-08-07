package com.example.phone.controllers;

import com.example.phone.models.entities.Brand;
import com.example.phone.models.entities.Phone;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PhoneControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    @Test
    void getAll() throws Exception {
        mockMvc.perform(get("/api/v1/phone/getAll"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getId() throws Exception {
        mockMvc.perform(get("/api/v1/phone/getId/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void createPhone() throws Exception {
        Phone phone=new Phone(1L,"A10","black",32,4,null,
                new Brand(1L,"samsung"));
        String toJson=objectMapper.writeValueAsString(phone);
        mockMvc.perform(post("/api/v1/phone/create")
                .contentType(APPLICATION_JSON_UTF8)
                .content(toJson))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    void updatePhone() {
    }

    @Test
    void deletePhone() throws Exception {
        mockMvc.perform(delete("/api/v1/phone/delete/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}