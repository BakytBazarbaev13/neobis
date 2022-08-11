package com.example.phone.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PriceControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAll() throws Exception {
        mockMvc.perform(get("/api/v1/price/getAll"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getPriceId() throws Exception {
        mockMvc.perform(get("/api/v1/price/getId/2"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void createPrice() {
    }

    @Test
    void updatePrice() {
    }

    @Test
    void deletePrice() throws Exception {
        mockMvc.perform(delete("/api/v1/price/delete/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}