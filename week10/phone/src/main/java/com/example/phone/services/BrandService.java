package com.example.phone.services;

import com.example.phone.models.entities.Brand;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface BrandService {
    ResponseEntity<?>saveBrand(Brand brand);
    List<Brand>getAllBrand();
    ResponseEntity<?>updateBrand(Brand brand);
    Optional<Brand> findById(Long id);
    ResponseEntity<?>deleteBrand(Long id);
}
