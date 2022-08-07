package com.example.phone.services.impl;

import com.example.phone.models.entities.Employees;
import com.example.phone.repositories.EmployeesRepo;
import com.example.phone.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesRepo employeesRepo;

    @Override
    public List<Employees> getAllEmployees() {
        return employeesRepo.findAll();
    }

    @Override
    public Optional<Employees> getById( Long id) {
        return employeesRepo.findById(id);
    }

    @Override
    public ResponseEntity<?> createEmployees(Employees employees) {
        try {
            employeesRepo.save(employees);
            return new ResponseEntity<String >("created employees", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("not created",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> updateEmployees(Employees employees) {
        try {
            employeesRepo.save(employees);
            return new ResponseEntity<String >("update employees", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("not update",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> deleteEmployees(Long id) {
        try {
            employeesRepo.deleteById(id);
            return new ResponseEntity<String>("delete employees",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("not delete",HttpStatus.BAD_REQUEST);
        }
    }
}
