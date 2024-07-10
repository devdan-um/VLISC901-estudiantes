package com.univer.estudiantes.service;

import com.univer.estudiantes.model.response.EstudianteResponse;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService<EstidianteResponse> {
    @Autowired
    private EstudianteRepository repository;

    public EstidianteResponse get

    public EstidianteResponse getGet(integer id) {
        EstudianteResponse response = new EstudianteResponse();

        Optional<EstuanteEntity> entity = repository.findById(id);
        if (entity.isPresent()){
            response.setNombre (entity.get().getNombre());
            response.setApellido (entity.get().getApellido());
        } else {
            return null;
        }
        return get;
    }


}
