package com.gestordeeventos.service;

import com.gestordeeventos.entity.UsuarioEvento;
import com.gestordeeventos.repository.UsuarioEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioEventoService {

    @Autowired
    private UsuarioEventoRepository usuarioEventoRepository;

    public List<UsuarioEvento> getAllUsuariosEventos() {
        return usuarioEventoRepository.findAll();
    }

    public UsuarioEvento createUsuarioEvento(UsuarioEvento usuarioEvento) {
        return usuarioEventoRepository.save(usuarioEvento);
    }

    public boolean deleteUsuarioEvento(Integer idUsuario, Integer idEvento) {
        if (usuarioEventoRepository.existsById(new UsuarioEvento(idUsuario, idEvento))) {
            usuarioEventoRepository.deleteById(new UsuarioEvento(idUsuario, idEvento));
            return true;
        }
        return false;
    }
}
