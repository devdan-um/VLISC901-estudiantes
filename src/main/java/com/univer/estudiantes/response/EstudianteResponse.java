package com.univer.estudiantes.response;

import org.springframework.beans.factory.annotation.Autowired;

public class EstudianteResponse {

    private  String nombre;
    private String apellido;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
