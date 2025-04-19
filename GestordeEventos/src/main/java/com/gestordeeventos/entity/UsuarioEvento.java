package com.gestordeeventos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "U_E")
public class UsuarioEvento {

    @Id
    @ManyToOne
    @JoinColumn(name = "IDUsuario", referencedColumnName = "IDUsuario")
    private Usuario usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "IDEvento", referencedColumnName = "IDEvento")
    private Evento evento;

    public UsuarioEvento(çç idUsuario, Integer idEvento) {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
