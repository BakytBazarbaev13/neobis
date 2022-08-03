package com.example.phone.services;

import com.example.phone.models.entities.Employees;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeesService {
    List<Employees>getAllEmployees();
    Optional<Employees>getById(Long id);
    ResponseEntity<?>createEmployees(Employees employees);
    ResponseEntity<?>updateEmployees(Employees employees);
    ResponseEntity<?>deleteEmployees(Long id);

}
