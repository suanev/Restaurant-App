package com.suanev.restaurant.resources;

import com.suanev.restaurant.domain.Cliente;
import com.suanev.restaurant.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {

    @Autowired
    ClienteService clienteService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cliente> getById(@PathVariable Integer id) {
        Cliente cliente = clienteService.getById(id);
        return ResponseEntity.ok().body(cliente);
    }
}
