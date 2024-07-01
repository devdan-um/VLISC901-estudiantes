package com.univer.estudiantes.controller;

import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;

    @GetMapping("/api/univer/estudiante/{id}")
    public EstudianteEntity estudiantePorId(@PathVariable Integer id) {

        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        } else {
            return new EstudianteEntity();
        }

    }

    @PostMapping("/api/univer/estudiante")
    public ResponseEntity guardado(@RequestBody EstudianteRequest request) {

        EstudianteEntity entity = new EstudianteEntity();
        entity.setNombre(request.getName());
        entity.setApellido(request.getApellido());
        entity.setEnrolado(request.getEnrollado());
        entity.setIdCurso(request.getCurso());
        entity.setTelefono(request.getTelefono());

        this.repository.save(entity);
        return ResponseEntity.ok("se guardo exitosamente");

    }
}