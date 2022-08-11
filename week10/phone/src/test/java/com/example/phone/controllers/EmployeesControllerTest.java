package com.example.phone.controllers;

import com.example.phone.models.entities.Employees;
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
class EmployeesControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void getEmployees() throws Exception {
        mockMvc.perform(get("/api/v1/employees/getAll"))
                .andDo(print())
                .andExpect(status().isOk() );
    }

    @Test
    void getId() throws Exception {
        mockMvc.perform(get("/api/v1/employees/getId/1"))
                .andDo(print())
                .andExpect(status().isOk() );
    }

    @Test
    void createEmployees() throws Exception {
        Employees employees=new Employees(1L,"Bakyt","Bishkek","0509116216");
        String toJson=objectMapper.writeValueAsString(employees);
        mockMvc.perform(post("/api/v1/employees/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(toJson))
                .andDo(print())
                .andExpect(status().isOk() );

    }

    @Test
    void updateEmployees() throws Exception {
        Employees employees=new Employees(1L,"Bakyt","Bishkek","0509116216");
        String toJson=objectMapper.writeValueAsString(employees);
        mockMvc.perform(put("/api/v1/employees/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(toJson))
                .andDo(print())
                .andExpect(status().isOk() );
    }

    @Test
    void deleteEmployees() throws Exception {
        mockMvc.perform(delete("/api/v1/employees/delete/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}