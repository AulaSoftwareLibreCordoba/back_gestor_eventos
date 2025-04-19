package com.gestordeeventos.repository;

import com.gestordeeventos.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    //añadir metodos para buscar por correo etc
}
