package com.gestordeeventos.service;

import com.gestordeeventos.entity.Usuario;
import com.gestordeeventos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioById(Integer id) {
        return usuarioRepository.findById(id);
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> updateUsuario(Integer id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuario.setIDUsuario(id);  // Asegurarse de que se actualiza el ID correcto
            return Optional.of(usuarioRepository.save(usuario));
        }
        return Optional.empty();
    }

    public boolean deleteUsuario(Integer id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
