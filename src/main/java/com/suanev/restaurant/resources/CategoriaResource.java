package com.suanev.restaurant.resources;

import com.suanev.restaurant.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public String getAll() {
//        List<Categoria> categorias =
        return "rest esta funcionando";
    }
}
