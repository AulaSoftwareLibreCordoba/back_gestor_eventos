package com.gestordeeventos.repository;

import com.gestordeeventos.entity.Organizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizadorRepository extends JpaRepository<Organizador, Integer> {
    // Métodos personalizados si es necesario
}
