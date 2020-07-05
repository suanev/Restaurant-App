package com.suanev.restaurant.service;

import com.suanev.restaurant.Repositories.CategoriaRepository;
import com.suanev.restaurant.Repositories.ProdutoRepository;
import com.suanev.restaurant.domain.Categoria;
import com.suanev.restaurant.domain.Produto;
import com.suanev.restaurant.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Produto getById(Integer id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id+", Tipo: "+Produto.class.getName()));
    }

    public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        List<Categoria> categorias = categoriaRepository.findAllById(ids);
        return  produtoRepository.findDistinctByNomeContainingAndCategoriasIn(nome, categorias, pageRequest);
    }
}
