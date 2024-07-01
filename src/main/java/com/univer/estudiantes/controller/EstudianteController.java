package com.univer.estudiantes.controller;

import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;

    @GetMapping("/api/univer/estudiante/{id}")
    public EstudianteEntity EstudiantePorId(@PathVariable Integer id){

        if(repository.findById(id).isPresent()){
            return repository.findById(id).get();
        } else {
            return new EstudianteEntity();
        }

    }


}
