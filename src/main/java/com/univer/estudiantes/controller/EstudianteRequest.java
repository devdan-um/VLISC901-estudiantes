package com.univer.estudiantes.controller;

public class EstudianteRequest {
    private String nombre;
    private String apellido;
    private Boolean enrolado;
    private Integer IdCurso;
    private Integer telefono;

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

    public Boolean getEnrolado() {
        return enrolado;
    }

    public void setEnrolado(Boolean enrolado) {
        this.enrolado = enrolado;
    }

    public Integer getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Integer idCurso) {
        IdCurso = idCurso;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
