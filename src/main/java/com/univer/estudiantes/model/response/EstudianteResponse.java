package com.univer.estudiantes.model.response;

//@Entity
public class EstudianteResponse {
    private  String Nombre;
    private String Apellido;
    private Integer IdCurso;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public Integer getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.IdCurso = idCurso;
    }
}
