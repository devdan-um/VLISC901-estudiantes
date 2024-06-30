package com.univer.estudiantes.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ESTUDIANTE")

public class EstudianteEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiante;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "ENROLADO")
    private Boolean enrolado;

    @Column(name = "ID_CURSO")
    private Integer idCurso;

    @Column(name = "TELEFONO")
    private Integer telefono;

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

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
}
