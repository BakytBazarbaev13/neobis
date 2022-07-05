package com.example.phone_service.controllers;

import com.example.phone_service.models.Client;
import com.example.phone_service.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClientController {
    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/getAll")
    public List<Client> getAll(){
        return clientRepo.findAll();
    }

    @GetMapping("/getId/{id}")
    public Client getById(@PathVariable Long id){
        return clientRepo.findById(id).orElse(null);
    }

    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client){
        return clientRepo.save(client);
    }

    @PostMapping("/create")
    public Client createClient(@RequestBody Client client){
        return clientRepo.save(client);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        clientRepo.deleteById(id);
        return "delete";
    }




}
