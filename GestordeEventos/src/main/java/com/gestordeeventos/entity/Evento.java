package com.gestordeeventos.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEvento")
    private Integer idEvento;

    @Column(name = "Nombre", length = 100)
    private String nombre;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Aforo")
    private Integer aforo;

    @Column(name = "Lugar", length = 100)
    private String lugar;

    @ManyToOne
    @JoinColumn(name = "IDCategoria", referencedColumnName = "IDCategoria")
    private Categoria categoria;

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}