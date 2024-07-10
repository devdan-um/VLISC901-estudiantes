package com.univer.estudiantes.controller;

import com.univer.estudiantes.service.EstudianteService;
import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteRequest {
    @Autowired
    private EstudianteService estudianteService;

    @Autowired
    private EstudianteRepository estudianteRepository;

    /*
    @PostMapping("/api/univer/estudiante/save")
    public EstudianteEntity createEstudiante(@RequestBody EstudianteEntity estudiante){
       return estudianteService.createEstudiante(estudiante);

    }*/
    /*
    @PostMapping("/api/univer/estudiante/save")
    public ResponseEntity<EstudianteEntity> guardarEstudiante(@RequestBody EstudianteEntity request) {
        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante.setNombre(request.getNombre());
        estudiante.setApellido(request.getApellido());
        estudiante.setEnrolado(request.getEnrolado());
        estudiante.setIdCurso(request.getIdCurso());
        estudiante.setTelefono(request.getTelefono());
        EstudianteEntity savedEstudiante = estudianteRepository.save(estudiante);
        return new ResponseEntity<>(savedEstudiante, HttpStatus.CREATED);
    }*/

    @GetMapping("/api/univer/estudiante/all")
    public List<EstudianteEntity> getAllEstudiantes(){
        return estudianteService.getAllEstudiantes();
    }

    @GetMapping("/api/univer/estudiante/get/get/{id}")
    public EstudianteEntity searchStudentById(@PathVariable("id") Integer ID){
        return estudianteService.getEstudianteById(ID);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEstudianteById(@PathVariable("ID") Integer ID){
        estudianteService.deleteEstudiante(ID);
    }

    @GetMapping("/test/consulta/{id}")
    public ResponseEntity estudiante(@PathVariable int id){
        return  ResponseEntity.ok(this.estudianteRepository.findById(id).get());

    }
}
