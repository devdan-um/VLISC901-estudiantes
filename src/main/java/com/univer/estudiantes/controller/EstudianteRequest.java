package com.univer.estudiantes.controller;

public class EstudianteRequest {
    private String name;
    private String apellido;
    private Boolean enrollado;
    private Integer curso;
    private Integer telefono;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getEnrollado() {
        return enrollado;
    }

    public void setEnrollado(Boolean enrollado) {
        this.enrollado = enrollado;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}


