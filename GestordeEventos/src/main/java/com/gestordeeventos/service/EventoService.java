package com.gestordeeventos.service;

import com.gestordeeventos.entity.Evento;
import com.gestordeeventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    public Optional<Evento> getEventoById(Integer id) {
        return eventoRepository.findById(id);
    }

    public Evento createEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public Optional<Evento> updateEvento(Integer id, Evento evento) {
        if (eventoRepository.existsById(id)) {
            evento.setIDEvento(id);  // Asegurarse de que se actualiza el ID correcto
            return Optional.of(eventoRepository.save(evento));
        }
        return Optional.empty();
    }

    public boolean deleteEvento(Integer id) {
        if (eventoRepository.existsById(id)) {
            eventoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
