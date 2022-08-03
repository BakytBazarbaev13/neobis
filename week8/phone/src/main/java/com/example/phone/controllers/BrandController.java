package com.example.phone.controllers;

import com.example.phone.models.entities.Brand;
import com.example.phone.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/getAll")
    public List<Brand>findAll(){
        return brandService.getAllBrand();
    }

    @GetMapping("/getById/{id}")
    public Optional<Brand> findById(@PathVariable Long id){

            return brandService.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createBrand(@RequestBody Brand brand){
        return brandService.saveBrand(brand);
    }

    @PutMapping("/update")
    public ResponseEntity<?>updateBrand(@RequestBody Brand brand){
        return brandService.updateBrand(brand);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteBrand(@PathVariable Long id){
        return brandService.deleteBrand(id);
    }
}
