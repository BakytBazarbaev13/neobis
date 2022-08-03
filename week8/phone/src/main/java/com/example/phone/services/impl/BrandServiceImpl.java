package com.example.phone.services.impl;

import com.example.phone.models.entities.Brand;
import com.example.phone.repositories.BrandRepo;
import com.example.phone.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepo brandRepo;

    @Override
     public ResponseEntity<?> saveBrand(Brand brand) {
        try {
            brandRepo.save(brand);
            return new ResponseEntity<String>("brand created", HttpStatus.OK);
        }
        catch (Exception e){
            return new  ResponseEntity<String>("not created",HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    public List<Brand> getAllBrand() {
        return brandRepo.findAll();
    }

    @Override
    public ResponseEntity<?> updateBrand(Brand brand) {
        try{
            brandRepo.save(brand);
            return new ResponseEntity<String >("brand update",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String >("not update",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public Optional<Brand> findById(Long id) {
        //try {
            //brandRepo.findById(id);
            return brandRepo.findById(id);
       /* }catch (Exception e){
            return new ResponseEntity<String>("not found id "+id,HttpStatus.BAD_REQUEST);
        }*/
    }

    @Override
    public ResponseEntity<?> deleteBrand(Long id) {
        try {
            brandRepo.deleteById(id);
            return new ResponseEntity<String> ("brand delete",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>("not found "+id,HttpStatus.BAD_REQUEST);
        }
    }
}
