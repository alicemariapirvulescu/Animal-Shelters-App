package com.firstapp.firstapp.api;

import com.firstapp.firstapp.model.Animal;
import com.firstapp.firstapp.service.animalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/animal/")
@Slf4j //face legatura dintre @data cu controller-ul
public class AnimalController {
    private final animalService animalService;

    public AnimalController(com.firstapp.firstapp.service.animalService animalService) {
        this.animalService = animalService;
    }
    @PostMapping (path = "animal/save/")
    public Animal save(@RequestBody Animal animal)
    {
        return animalService.save(animal);
    }
    @GetMapping( path = "animal/get/")
    public List<Animal> get()
    {
        return animalService.get();
    }
    @DeleteMapping(path = "animal/delete/{id}/")
    public void delete(@PathVariable("id") Long id)
    {
        animalService.delete(id);
    }



}
