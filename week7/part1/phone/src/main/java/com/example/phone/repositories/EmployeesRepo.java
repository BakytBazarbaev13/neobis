package com.example.phone.repositories;

import com.example.phone.models.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepo extends JpaRepository<Employees,Long> {
}
