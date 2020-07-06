package com.suanev.restaurant.resources;

import com.suanev.restaurant.domain.Cliente;
import com.suanev.restaurant.domain.Cliente;
import com.suanev.restaurant.dto.ClienteDTO;
import com.suanev.restaurant.dto.ClienteNewDTO;
import com.suanev.restaurant.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {

    @Autowired
    ClienteService clienteService;

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ClienteDTO>> get() {
        List<Cliente> clientes = clienteService.get();
        List<ClienteDTO> clienteDTOS = clientes.stream().map(cliente -> new ClienteDTO(cliente)).collect(Collectors.toList());
        return ResponseEntity.ok().body(clienteDTOS);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cliente> getById(@PathVariable Integer id) {
        Cliente cliente = clienteService.getById(id);
        return ResponseEntity.ok().body(cliente);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody ClienteNewDTO clienteDTO) {
        Cliente cliente = clienteService.fromDTO(clienteDTO);
        cliente = clienteService.insert(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@Valid @RequestBody ClienteDTO clienteDTO, @PathVariable Integer id) {
        Cliente cliente = clienteService.fromDTO(clienteDTO);
        cliente.setId(id);
        cliente = clienteService.update(cliente);
        return ResponseEntity.noContent().build();
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping(value="/page", method=RequestMethod.GET)
    public ResponseEntity<Page<ClienteDTO>> findPage(
            @RequestParam(value="page", defaultValue="0") Integer page,
            @RequestParam(value="linesPerPage", defaultValue="24") Integer linesPerPage,
            @RequestParam(value="orderBy", defaultValue="nome") String orderBy,
            @RequestParam(value="direction", defaultValue="ASC") String direction) {
        Page<Cliente> list =  clienteService.findPage(page, linesPerPage, orderBy, direction);
        Page<ClienteDTO> listDto = list.map(cliente -> new ClienteDTO(cliente));
        return ResponseEntity.ok().body(listDto);
    }
}
