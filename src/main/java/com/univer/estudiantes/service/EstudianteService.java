package com.univer.estudiantes.service;

import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.model.response.EstudianteResponse;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstudianteService<EstidianteResponse> {
    @Autowired
    private EstudianteRepository repository;

    public EstidianteResponse get;

    public EstidianteResponse getGet(integer id) {
        EstudianteResponse response = new EstudianteResponse();

        Optional<EstudianteEntity> entity = repository.findById(id);
        if (entity.isPresent()){
            response.setNombre (entity.get().getNombre());
            response.setApellido (entity.get().getApellido());
        } else {
            return null;
        }
        return get;
    }


}
