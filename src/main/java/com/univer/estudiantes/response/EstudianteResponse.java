package com.univer.estudiantes.response;

public class EstudianteResponse {

    private String nombre;
    private String apellido;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }
}
