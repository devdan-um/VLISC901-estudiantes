package com.univer.estudiantes.controller;
import org.springframework.web.bind.annotation.*;
import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.model.request.EstudianteRequest;
import com.univer.estudiantes.model.response.EstudianteResponse;
import com.univer.estudiantes.model.response.Notificaciones;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;

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
    public ResponseEntity<EstudianteResponse> guardarEstudiante(@RequestBody EstudianteRequest request){

        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante.setNombre(request.getNombre());
        estudiante.setApellido(request.getApellido());
        estudiante.setEnrolado(request.getEnrolado());
        estudiante.setIdCurso(request.getIdCurso());


        repository.save(estudiante);

        EstudianteResponse response = new EstudianteResponse();
        response.setNombre(estudiante.getNombre());
        response.setApellido(estudiante.getApellido());
        response.setIdCurso(estudiante.getIdCurso());

        Notificaciones notificacion = new Notificaciones();
        notificacion.setLevel("INFO");
        notificacion.setMessage("El registro se guardo de manera adecuada");
        notificacion.setHttpStatus(HttpStatus.CREATED);

        response.setNotificaciones(notificacion);

        return new ResponseEntity<>(response, response.getNotificaciones().getHttpStatus());

    }


}
