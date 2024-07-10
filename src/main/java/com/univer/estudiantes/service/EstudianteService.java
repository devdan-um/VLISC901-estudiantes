package com.univer.estudiantes.service;

import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.model.response.EstudianteResponse;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component
@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public EstudianteEntity createEstudiante(EstudianteEntity estudiante){
        return estudianteRepository.save(estudiante);
    }

    public EstudianteEntity getEstudianteById(Integer id) {

        EstudianteResponse response = new EstudianteResponse();

        //Optional<EstudianteEntity> optionalEstudiante = estudianteRepository.findById(ID);
        Optional<EstudianteEntity> entity = estudianteRepository.findById(id);

        if (entity.isPresent()){
            response.setNombre(entity.get().getNombre());
            response.setApellido(entity.get().getApellido());
        }else{
            return null;
        }

        return entity.get();
    }

    public List<EstudianteEntity> getAllEstudiantes(){
        return (List<EstudianteEntity>) estudianteRepository.findAll();
    }

    public void deleteEstudiante(Integer ID){
        estudianteRepository.deleteById(ID);
    }

    public EstudianteResponse getEstudiante(Integer id){
        EstudianteResponse response = new EstudianteResponse();

        Optional<EstudianteEntity> entity = estudianteRepository.findById(id);

        if(entity.isPresent()){
            response.setNombre(entity.get().getNombre());
            response.setApellido(entity.get().getApellido());
            return response;

        }else {
            return  null;
        }
    }

}
