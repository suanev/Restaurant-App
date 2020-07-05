package com.suanev.restaurant.service;

import com.suanev.restaurant.Repositories.PedidoRepository;
import com.suanev.restaurant.domain.Pedido;
import com.suanev.restaurant.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido getById(Integer id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id+", Tipo: "+Pedido.class.getName()));
    }

//    public Page<Pedido> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
//        UserSS user = UserService.authenticated();
//        if (user == null) {
//            throw new AuthorizationException("Acesso negado");
//        }
//        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
//        Cliente cliente =  clienteService.find(user.getId());
//        return repo.findByCliente(cliente, pageRequest);
//    }
}
