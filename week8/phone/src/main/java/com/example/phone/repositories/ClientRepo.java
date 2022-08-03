package com.example.phone.repositories;

import com.example.phone.models.entities.Clientt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Clientt,Long> {
}
