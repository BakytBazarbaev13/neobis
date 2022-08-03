package com.example.phone.controllers;

import com.example.phone.models.entities.Operation;
import com.example.phone.services.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/vi/operation")
public class OperationController {
    @Autowired
    private OperationService operationService;

    @GetMapping("/getAll")
    public List<Operation>getAllOperation(){
        return operationService.getAll();
    }

    @GetMapping("/getId/{id}")
    public Optional<Operation>getById(@PathVariable Long id){
        return operationService.getById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<?>createOperation(@RequestBody Operation operation){
        return operationService.createOperation(operation);
    }

    @PutMapping("/update")
    public ResponseEntity<?>updateOperation(Operation operation){
        return operationService.updateOperation(operation);
    }

    @DeleteMapping("/delete/{id} ")
    public ResponseEntity<?>deleteOperation(@PathVariable Long id){
        return operationService.deleteOperation(id);
    }
}