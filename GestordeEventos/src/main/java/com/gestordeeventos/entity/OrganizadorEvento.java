package com.gestordeeventos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "O_E")
public class OrganizadorEvento {

    @Id
    @ManyToOne
    @JoinColumn(name = "IDOrganizador", referencedColumnName = "IDOrganizador")
    private Organizador organizador;

    @Id
    @ManyToOne
    @JoinColumn(name = "IDEvento", referencedColumnName = "IDEvento")
    private Evento evento;

    public OrganizadorEvento(Integer idOrganizador, Integer idEvento) {
        this.organizador = new Organizador();
        this.evento = new Evento();
    }

    public OrganizadorEvento() {
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
