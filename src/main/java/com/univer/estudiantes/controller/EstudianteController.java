package com.univer.estudiantes.controller;

import com.univer.estudiantes.EstudianteService;
import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/api/univer/estudiante/{id}")
    public EstudianteEntity estudiantePorId(@PathVariable Integer id){

        if(repository.findById(id).isPresent()){
            return repository.findById(id).get();
        } else {
            return new EstudianteEntity();
        }
    }
}
