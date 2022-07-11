package com.example.phone.controllers;

import com.example.phone.models.entities.Price;
import com.example.phone.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/price")
public class PriceController {
    @Autowired
    private PriceService priceService;

    @GetMapping("/getAll")
    public List<Price>getAll(){
        return priceService.getPriceAll();
    }

    @GetMapping("/getId/{id}")
    public Optional<Price>getPriceId(@PathVariable Long id){
        return priceService.getById(id);

    }

    @PostMapping("/create")
    public ResponseEntity<?>createPrice(@RequestBody Price price){
        return priceService.savePrice(price);
    }

    @PutMapping("/update")
    public ResponseEntity<?>updatePrice(Price price){
        return priceService.updatePrice(price);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deletePrice(@PathVariable Long id){
        return priceService.deletePrice(id);
    }

}
