package com.gestordeeventos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Organizador")
public class Organizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDOrganizador")
    private Integer idOrganizador;

    @Column(name = "Nombre", length = 50)
    private String nombre;

    @Column(name = "Apellido1", length = 50)
    private String apellido1;

    @Column(name = "Apellido2", length = 50)
    private String apellido2;

    public Integer getIdOrganizador() {
        return idOrganizador;
    }

    public void setIdOrganizador(Integer idOrganizador) {
        this.idOrganizador = idOrganizador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
}