package com.example.phone.controllers;

import com.example.phone.models.entities.Brand;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class})
class BrandControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;






   @Test
   public void findAllTest() throws  Exception{
       this.mockMvc.perform(get("/api/v1/brand/getAll"))
               .andDo(print())
               .andExpect(status().isOk());
   }

    @Test
   public void findById() throws Exception {
        this.mockMvc.perform(get("/api/v1/brand/getById/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void createBrand() throws Exception {
        Brand brand=new Brand(1L,"iphone");
        String toJson=objectMapper.writeValueAsString(brand);
        mockMvc.perform(post("/api/v1/brand/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(toJson
                        ))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void updateBrand() throws Exception {
        Brand brand=new Brand("samsung");
        String toJson= objectMapper.writeValueAsString(brand);
        mockMvc.perform(put("/api/v1/brand/update/3")
                         .contentType(MediaType.APPLICATION_JSON)
                        .content(toJson))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void deleteBrand() throws Exception {
       mockMvc.perform(delete("/api/v1/brand/delete/4"))
               .andDo(print())
               .andExpect(status().isOk());
    }
}