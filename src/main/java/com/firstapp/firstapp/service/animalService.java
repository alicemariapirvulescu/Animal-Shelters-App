package com.firstapp.firstapp.service;

import com.firstapp.firstapp.dao.animalRepository;
import com.firstapp.firstapp.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class animalService{
    private animalRepository animalRepository;

    public animalService(com.firstapp.firstapp.dao.animalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }
    public Animal save(Animal animal)
    {
        return animalRepository.save(animal);
    }
    public List<Animal> get()
    {
        return animalRepository.findAll();
    }
    public void delete(Long id)
    {
        Optional<Animal> animal = animalRepository.findById(id);
        animal.ifPresent(value -> animalRepository.delete(value));
    }

}
