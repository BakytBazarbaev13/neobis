package com.example.phone.repositories;

import com.example.phone.models.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepo extends JpaRepository<Operation,Long> {
}
