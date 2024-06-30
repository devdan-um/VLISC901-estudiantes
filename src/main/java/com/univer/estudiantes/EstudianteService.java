package com.univer.estudiantes;

import com.univer.estudiantes.entity.EstudianteEntity;
import com.univer.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public EstudianteEntity createEstudiante(EstudianteEntity estudiante){
        return estudianteRepository.save(estudiante);
    }

    public EstudianteEntity getEstudianteById(Integer ID) {
        Optional<EstudianteEntity> optionalEstudiante = estudianteRepository.findById(ID);
        return optionalEstudiante.get();
    }

    public List<EstudianteEntity> getAllEstudiantes(){
        return (List<EstudianteEntity>) estudianteRepository.findAll();
    }

    public void deleteEstudiante(Integer ID){
        estudianteRepository.deleteById(ID);
    }
}
