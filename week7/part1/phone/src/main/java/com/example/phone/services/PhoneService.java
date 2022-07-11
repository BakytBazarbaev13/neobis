package com.example.phone.services;

import com.example.phone.models.entities.Phone;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface PhoneService {
    List<Phone>getAllPhone();
    Optional<Phone>getById(Long id);
    ResponseEntity<?>savePhone(Phone phone);
    ResponseEntity<?>updatePhone(Phone phone);
    ResponseEntity<?>deletePhone(Long id);
}
