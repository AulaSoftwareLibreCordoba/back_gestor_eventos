package com.gestordeeventos.repository;

import com.gestordeeventos.entity.OrganizadorEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizadorEventoRepository extends JpaRepository<OrganizadorEvento, Integer> {
    boolean existsById(OrganizadorEvento organizadorEvento);

    void deleteById(OrganizadorEvento organizadorEvento);
}
