package com.example.phone.services;

import com.example.phone.models.entities.Clientt;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    ResponseEntity<?>saveClient(Clientt clientt);
    ResponseEntity<?>updateClient(Clientt clientt);
    List<Clientt>getAll();
    Optional<Clientt>getId(Long id);
    ResponseEntity<String> deleteClient(Long id);

}
