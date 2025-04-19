package com.gestordeeventos.repository;

import com.gestordeeventos.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
    // Métodos personalizados si es necesario
}