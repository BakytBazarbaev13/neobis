package com.example.phone.services.impl;

import com.example.phone.models.entities.Clientt;
import com.example.phone.repositories.ClientRepo;
import com.example.phone.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired

    private ClientRepo clientRepo;

    @Override
    public ResponseEntity<?> saveClient(Clientt clientt) {
        try {
            clientRepo.save(clientt);
            return new ResponseEntity<String >("created client", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("not created",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> updateClient(Clientt clientt) {
        try {
            clientRepo.save(clientt);
            return new ResponseEntity<String>("update client",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("not update",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public List<Clientt> getAll() {
        return clientRepo.findAll();
    }

    @Override
    public Optional<Clientt> getId(Long id) {
        return clientRepo.findById(id);
    }

    @Override
    public ResponseEntity<String> deleteClient(Long id) {
        try {
            clientRepo.deleteById(id);
            return new ResponseEntity<String>("delete client",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String >("not delete",HttpStatus.BAD_REQUEST);
        }
    }
}
