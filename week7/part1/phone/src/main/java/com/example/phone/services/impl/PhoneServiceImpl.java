package com.example.phone.services.impl;

import com.example.phone.models.entities.Phone;
import com.example.phone.repositories.PhoneRepo;
import com.example.phone.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepo phoneRepo;

    @Override
    public List<Phone> getAllPhone() {
        return phoneRepo.findAll();
    }

    @Override
    public Optional<Phone> getById(Long id) {
        return phoneRepo.findById(id);
    }

    @Override
    public ResponseEntity<?> savePhone(Phone phone) {
        try {
            phoneRepo.save(phone);
            return new ResponseEntity<>("created phone", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("not create",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> updatePhone(Phone phone) {
        try {
            phoneRepo.save(phone);
            return new ResponseEntity<>("update phone", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("not update",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> deletePhone(Long id) {
        try {
            phoneRepo.deleteById(id);
            return new ResponseEntity<>("delete phone",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("not delete",HttpStatus.BAD_REQUEST);
        }
    }
}
