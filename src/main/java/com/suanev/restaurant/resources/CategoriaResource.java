package com.suanev.restaurant.resources;

import com.suanev.restaurant.domain.Categoria;
import com.suanev.restaurant.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @Autowired
    CategoriaService categoriaService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Categoria> getById(@PathVariable Integer id) {
        Categoria categoria = categoriaService.getById(id);
        return ResponseEntity.ok().body(categoria);
    }
}
