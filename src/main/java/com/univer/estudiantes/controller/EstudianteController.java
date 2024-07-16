package com.univer.estudiantes.controller;

import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import com.univer.estudiantes.response.EstudianteResponse;
import com.univer.estudiantes.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;


    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/api/univer/estudiante/{id}")
    public ResponseEntity estudiantePorId(@PathVariable Integer id){
        EstudianteResponse response = this.estudianteService.getEstudiante(1);

        if (response != null){
            return new ResponseEntity(response, HttpStatus.OK);
        }else {
            return ResponseEntity.noContent().build();
        }
    }

    /*@GetMapping("/api/univer/estudiante/{id}")
    public ResponseEntity<EstudianteEntity> estudiantePorId(@PathVariable Integer id){

        if(repository.findById(id).isPresent()){
            return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }*/


    @PostMapping("/api/univer/estudiante/save")
    public ResponseEntity<EstudianteEntity> guardarEstudiate(@RequestBody EstudianteRequest request) {
        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante.setNombre(request.getNombre());
        estudiante.setApellido(request.getApellido());
        estudiante.setEnrolado(request.getEnrolado());
        estudiante.setEnrolado(request.getEnrolado());
        estudiante.setIdCurso(request.getIdCurso());
        estudiante.setTelefono(request.getTelefono());

        EstudianteEntity savedEstudiante = repository.save(estudiante);

        return new ResponseEntity<>(savedEstudiante, HttpStatus.CREATED);

    }






}
