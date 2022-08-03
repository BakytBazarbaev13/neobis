package com.example.phone.controllers;

import com.example.phone.models.entities.Phone;
import com.example.phone.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/phone")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/getAll")
    public List<Phone>getAll(){
        return phoneService.getAllPhone();
    }

    @GetMapping("/getId/{id}")
    public Optional<Phone>getId(@PathVariable Long id){
        return phoneService.getById(id);
    }

    @PostMapping("create")
    public ResponseEntity<?>createPhone(@RequestBody Phone phone){
        return phoneService.savePhone(phone);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?>updatePhone(Phone phone){
        return phoneService.updatePhone(phone);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deletePhone(@PathVariable Long id){
        return phoneService.deletePhone(id);
    }
}
