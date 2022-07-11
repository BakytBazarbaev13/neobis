package com.example.phone.services;

import com.example.phone.models.entities.Employees;
import com.example.phone.models.entities.Operation;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface OperationService {
    List<Operation>getAll();
    Optional<Operation>getById(Long id);
    ResponseEntity<?>createOperation(Operation operation);
    ResponseEntity<?>updateOperation(Operation operation);
    ResponseEntity<?>deleteOperation(Long id);
}
