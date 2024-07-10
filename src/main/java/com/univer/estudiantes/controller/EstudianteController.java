package com.univer.estudiantes.controller;

import com.univer.estudiantes.model.request.EstudianteRequest;
import com.univer.estudiantes.model.response.EstudianteResponse;
import com.univer.estudiantes.service.EstudianteService;
import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/univer/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/{id}")
    public ResponseEntity<EstudianteResponse> estudiantePorId(@PathVariable Integer id) {
        EstudianteResponse response = estudianteService.getEstudiante(id);
        return response != null ? new ResponseEntity<>(response, HttpStatus.OK) : ResponseEntity.noContent().build();
    }

    @PostMapping("/save")
    public ResponseEntity<EstudianteEntity> guardarEstudiante(@RequestBody EstudianteRequest request) {
        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante.setNombre(request.getNombre());
        estudiante.setApellido(request.getApellido());
        estudiante.setEnrolado(request.getEnrolado());
        estudiante.setIdCurso(request.getIdCurso());
        estudiante.setTelefono(request.getTelefono());
        EstudianteEntity savedEstudiante = repository.save(estudiante);
        return new ResponseEntity<>(savedEstudiante, HttpStatus.CREATED);
    }
}
