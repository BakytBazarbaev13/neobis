package com.example.phone.services.impl;

import com.example.phone.models.entities.Price;
import com.example.phone.repositories.PriceRepo;
import com.example.phone.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRepo priceRepo;

    @Override
    public List<Price> getPriceAll() {
        return priceRepo.findAll();
    }

    @Override
    public Optional<Price> getById(Long id) {
        return priceRepo.findById(id);
    }

    @Override
    public ResponseEntity<?> savePrice(Price price) {
        try {
            priceRepo.save(price);
            return new ResponseEntity<>("created price", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("not create",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> updatePrice(Price price) {
        try {
            priceRepo.save(price);
            return new ResponseEntity<>("update price", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("not update",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> deletePrice(Long id) {
        try {
            priceRepo.deleteById(id);
            return new ResponseEntity<>("delete price",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("not delete",HttpStatus.BAD_REQUEST);
        }
    }
}
