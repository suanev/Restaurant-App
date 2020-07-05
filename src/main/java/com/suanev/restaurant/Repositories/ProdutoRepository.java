package com.suanev.restaurant.Repositories;

import com.suanev.restaurant.domain.Categoria;
import com.suanev.restaurant.domain.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    @Transactional(readOnly = true)
  Page<Produto> findDistinctByNomeContainingAndCategoriasIn(
            String nome,
            List<Categoria> categorias,
            Pageable pageRequest);
}
