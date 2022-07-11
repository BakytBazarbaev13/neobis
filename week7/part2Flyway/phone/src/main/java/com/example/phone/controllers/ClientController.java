package com.example.phone.controllers;

import com.example.phone.models.entities.Clientt;
import com.example.phone.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/getAll")
    public List<Clientt>getAllClient(){
        return clientService.getAll();
    }

    @GetMapping("/getId/{id}")
    public Optional<Clientt> getId(@PathVariable Long id){
        return clientService.getId(id);
    }

    @PostMapping("/create")
    public ResponseEntity<?>saveClient(@RequestBody Clientt clientt){
        return clientService.saveClient(clientt);
    }

    @PutMapping("/update")
    public ResponseEntity<?>updateClient(Clientt clientt){
        return clientService.updateClient(clientt);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteClient(@PathVariable Long id){
        return clientService.deleteClient(id);
    }
}
