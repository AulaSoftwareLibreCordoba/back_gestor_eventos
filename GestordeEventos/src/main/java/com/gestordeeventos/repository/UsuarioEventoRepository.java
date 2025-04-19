package com.gestordeeventos.repository;

import com.gestordeeventos.entity.UsuarioEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioEventoRepository extends JpaRepository<UsuarioEvento, Integer> {
    // Métodos personalizados si es necesario
}