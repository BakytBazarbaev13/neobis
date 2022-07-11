package com.example.phone.controllers;

import com.example.phone.models.entities.Employees;
import com.example.phone.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;

    @GetMapping("/getAll")
    public List<Employees>getEmployees(){
        return employeesService.getAllEmployees();
    }

    @GetMapping("/getId/{id}")
    public Optional<Employees>getId(@PathVariable Long id){
        return employeesService.getById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<?>createEmployees(@RequestBody Employees employees){
        return employeesService.createEmployees(employees);
    }

    @PutMapping("/update")
    public ResponseEntity<?>updateEmployees(Employees employees){
        return employeesService.updateEmployees(employees);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteEmployees(@PathVariable Long id){
        return employeesService.deleteEmployees(id);
    }
}
