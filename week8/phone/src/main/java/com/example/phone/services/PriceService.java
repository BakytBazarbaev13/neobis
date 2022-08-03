package com.example.phone.services;

import com.example.phone.models.entities.Price;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface PriceService {
    List<Price> getPriceAll();
    Optional<Price> getById(Long id);
    ResponseEntity<?>savePrice(Price price);
    ResponseEntity<?>updatePrice(Price price);
    ResponseEntity<?>deletePrice(Long id);
}
