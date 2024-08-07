package com.univer.estudiantes.model.request;

public class EstudianteRequest {
    private String nombre;
    private String apellido;
    private Boolean enrolado;
    private Integer idCurso;
    private Long telefono;

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
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
}
