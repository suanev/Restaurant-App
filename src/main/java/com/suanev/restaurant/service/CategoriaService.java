package com.suanev.restaurant.service;

import com.suanev.restaurant.Repositories.CategoriaRepository;
import com.suanev.restaurant.domain.Categoria;
import com.suanev.restaurant.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria getById(Integer id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id+", Tipo: "+Categoria.class.getName()));
    }

    public Categoria insert(Categoria categoria) {
        categoria.setId(null);
        return categoriaRepository.save(categoria);
    }

    public Categoria update(Categoria categoria) {
        getById(categoria.getId());
        return categoriaRepository.save(categoria);
    }
}
