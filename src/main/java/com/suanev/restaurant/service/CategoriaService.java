package com.suanev.restaurant.service;

import com.suanev.restaurant.Repositories.CategoriaRepository;
import com.suanev.restaurant.domain.Categoria;
import com.suanev.restaurant.dto.CategoriaDTO;
import com.suanev.restaurant.service.exceptions.DataIntegrityException;
import com.suanev.restaurant.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> get() {
        return categoriaRepository.findAll();
    }

    public Categoria getById(Integer id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id+", Tipo: "+Categoria.class.getName()));
    }

    public Categoria insert(Categoria categoria) {
        categoria.setId(null);
        return categoriaRepository.save(categoria);
    }

    public Categoria update(Categoria categoria) {
        Categoria newCategoria = getById(categoria.getId());
        updateData(newCategoria, categoria);
        return categoriaRepository.save(categoria);
    }

    public void delete(Integer id) {
        getById(id);
        try {
            categoriaRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possivel excluir uma categoria que possui produtos.");
        }
    }

    public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return categoriaRepository.findAll(pageRequest);
    }

    public Categoria fromDTO(CategoriaDTO categoriaDTO) {
        return new Categoria(categoriaDTO.getId(), categoriaDTO.getNome(), categoriaDTO.getImg());
    }

    private void updateData(Categoria newCategoria, Categoria categoria) {
        newCategoria.setNome(categoria.getNome());
    }
}
