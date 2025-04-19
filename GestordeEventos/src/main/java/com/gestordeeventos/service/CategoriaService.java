package com.gestordeeventos.service;

import com.gestordeeventos.entity.Categoria;
import com.gestordeeventos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> getCategoriaById(Integer id) {
        return categoriaRepository.findById(id);
    }

    public Categoria createCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> updateCategoria(Integer id, Categoria categoria) {
        if (categoriaRepository.existsById(id)) {
            categoria.setIDCategoria(id);  // Asegurarse de que se actualiza el ID correcto
            return Optional.of(categoriaRepository.save(categoria));
        }
        return Optional.empty();
    }

    public boolean deleteCategoria(Integer id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}