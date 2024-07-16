package com.univer.estudiantes.model.request;

public class EstudianteRequest {

    private String Nombre;
    private String Apellido;
    private Boolean Enrolado;
    private Integer IdCurso;
    private Integer telefono;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public Boolean getEnrolado() {
        return Enrolado;
    }

    public void setEnrolado(Boolean enrolado) {
        this.Enrolado = enrolado;
    }

    public Integer getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.IdCurso = idCurso;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}