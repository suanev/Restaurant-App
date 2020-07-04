package com.suanev.restaurant.resources;

import com.suanev.restaurant.domain.Pedido;
import com.suanev.restaurant.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {

    @Autowired
    PedidoService pedidoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pedido> getById(@PathVariable Integer id) {
        Pedido pedido = pedidoService.getById(id);
        return ResponseEntity.ok().body(pedido);
    }
}
