package com.example.phone.controllers;

import com.example.phone.models.entities.Clientt;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ClientControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void getAllClient() throws Exception {
        mockMvc.perform(get("/api/v1/client/getAll"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getId() throws Exception {
        mockMvc.perform(get("/api/v1/client/getId/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void saveClient() throws Exception {
        Clientt client=new Clientt(1L,"Bakyt","Bishkek","0509116216");
        String toJson=objectMapper.writeValueAsString(client);
        mockMvc.perform(post("/api/v1/client/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(toJson))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void updateClient() throws Exception {
        Clientt clientt=new Clientt(1L,"Beka","Kant","099999999");
        String toJson=objectMapper.writeValueAsString(clientt);
        mockMvc.perform(put("/api/v1/client/update")
                .contentType(MediaType.APPLICATION_JSON)
                .content(toJson))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void deleteClient() throws Exception {
        mockMvc.perform(delete("/api/v1/client/delete/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}