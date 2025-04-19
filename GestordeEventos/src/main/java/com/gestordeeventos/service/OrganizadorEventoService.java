package com.gestordeeventos.service;

import com.gestordeeventos.entity.Evento;
import com.gestordeeventos.entity.Organizador;
import com.gestordeeventos.entity.OrganizadorEvento;
import com.gestordeeventos.repository.OrganizadorEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizadorEventoService {

    @Autowired
    private OrganizadorEventoRepository organizadorEventoRepository;

    public List<OrganizadorEvento> getAllOrganizadoresEventos() {
        return organizadorEventoRepository.findAll();
    }

    public OrganizadorEvento createOrganizadorEvento(OrganizadorEvento organizadorEvento) {
        return organizadorEventoRepository.save(organizadorEvento);
    }

    public boolean deleteOrganizadorEvento(Integer IdOrganizador, Integer IdEvento) {
        if (organizadorEventoRepository.existsById(new OrganizadorEvento(IdOrganizador, IdEvento))) {
            organizadorEventoRepository.deleteById(new OrganizadorEvento(IdOrganizador, IdEvento));
            return true;
        }
        return false;
    }
}
