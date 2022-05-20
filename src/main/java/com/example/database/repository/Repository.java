package com.example.database.repository;

import com.example.database.entities.Database;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Database, Integer> {
}
