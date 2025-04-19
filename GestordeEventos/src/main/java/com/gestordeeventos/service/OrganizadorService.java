package com.gestordeeventos.service;

import com.gestordeeventos.entity.Organizador;
import com.gestordeeventos.repository.OrganizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizadorService {

    @Autowired
    private OrganizadorRepository organizadorRepository;

    public List<Organizador> getAllOrganizadores() {
        return organizadorRepository.findAll();
    }

    public Optional<Organizador> getOrganizadorById(Integer id) {
        return organizadorRepository.findById(id);
    }

    public Organizador createOrganizador(Organizador organizador) {
        return organizadorRepository.save(organizador);
    }

    public Optional<Organizador> updateOrganizador(Integer id, Organizador organizador) {
        if (organizadorRepository.existsById(id)) {
            organizador.setIDOrganizador(id);  // Asegurarse de que se actualiza el ID correcto
            return Optional.of(organizadorRepository.save(organizador));
        }
        return Optional.empty();
    }

    public boolean deleteOrganizador(Integer id) {
        if (organizadorRepository.existsById(id)) {
            organizadorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
