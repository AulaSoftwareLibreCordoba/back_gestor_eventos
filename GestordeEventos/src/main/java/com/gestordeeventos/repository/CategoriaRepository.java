package com.gestordeeventos.repository;

import com.gestordeeventos.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    // Métodos personalizados si es necesario
}
