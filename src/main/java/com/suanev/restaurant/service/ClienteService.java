package com.suanev.restaurant.service;

import com.suanev.restaurant.Repositories.ClienteRepository;
import com.suanev.restaurant.domain.Categoria;
import com.suanev.restaurant.domain.Cidade;
import com.suanev.restaurant.domain.Cliente;
import com.suanev.restaurant.domain.Endereco;
import com.suanev.restaurant.domain.enums.TipoCliente;
import com.suanev.restaurant.dto.ClienteDTO;
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
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> get() {
        return clienteRepository.findAll();
    }

    public Cliente getById(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id+", Tipo: "+Cliente.class.getName()));
    }

    public Cliente insert(Cliente cliente) {
        cliente.setId(null);
        return clienteRepository.save(cliente);
    }

    public Cliente update(Cliente cliente) {
        Cliente newCliente = getById(cliente.getId());
        updateData(newCliente, cliente);
        return clienteRepository.save(newCliente);
    }

    public void delete(Integer id) {
        getById(id);
        try {
            clienteRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possivel excluir um cliente que possui pedidos.");
        }
    }

    public Page<Cliente> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return clienteRepository.findAll(pageRequest);
    }

    public Cliente fromDTO(ClienteDTO clienteDTO) {
        return new Cliente(null, clienteDTO.getNome(), clienteDTO.getEmail(), null, null);
    }

    private void updateData(Cliente newCliente, Cliente cliente) {
        newCliente.setNome(cliente.getNome());
        newCliente.setEmail(cliente.getEmail());
    }
}
