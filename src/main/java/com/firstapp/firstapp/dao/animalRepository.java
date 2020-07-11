package com.firstapp.firstapp.dao;

import com.firstapp.firstapp.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface animalRepository extends JpaRepository<Animal,Long> {
}
