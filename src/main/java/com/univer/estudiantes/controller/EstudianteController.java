package com.univer.estudiantes.controller;

import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.model.request.EstudianteRequest;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;

    @GetMapping("/api/univer/estudiante/{id}")
    public ResponseEntity<EstudianteEntity> estudiantePorId(@PathVariable Integer id){

        if(repository.findById(id).isPresent()){
            return ResponseEntity.ok(repository.findById(id).get());
        } else {
            return ResponseEntity.noContent().build();
        }

    }

    @PostMapping("/api/univer/estudiante/save")
    public ResponseEntity<EstudianteEntity> guardarEstudiante(@RequestBody EstudianteRequest request){

        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante.setNombre(request.getNombre());
        estudiante.setApellido(request.getApellido());
        estudiante.setEnrolado(request.getEnrolado());
        estudiante.setIdCurso(request.getIdCurso());
        estudiante.setTelefono(request.getTelefono());

        repository.save(estudiante);
        return new ResponseEntity<>(estudiante, HttpStatus.CREATED);

    }


}
