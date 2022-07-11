package com.example.phone.services.impl;

import com.example.phone.models.entities.Employees;
import com.example.phone.models.entities.Operation;
import com.example.phone.repositories.OperationRepo;
import com.example.phone.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OperationServiceImpl implements OperationService {
    @Autowired
    private OperationRepo operationRepo;

    @Override
    public List<Operation> getAll() {
        return operationRepo.findAll();
    }

    @Override
    public Optional<Operation> getById(Long id) {
        return operationRepo.findById(id);
    }

    @Override
    public ResponseEntity<?> createOperation(Operation operation) {
        try {
            operationRepo.save(operation);
            return new ResponseEntity<String >("created operation", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("not created",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> updateOperation(Operation operation) {
        try {
            operationRepo.save(operation);
            return new ResponseEntity<String>("update operation",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("Not update",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> deleteOperation(Long id) {
        try {
            operationRepo.deleteById(id);
            return new ResponseEntity<>("delete operation",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("not delete",HttpStatus.BAD_REQUEST);
        }
    }
}
