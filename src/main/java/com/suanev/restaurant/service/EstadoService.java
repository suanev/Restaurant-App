package com.suanev.restaurant.service;

import com.suanev.restaurant.Repositories.EstadoRepository;
import com.suanev.restaurant.domain.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> getAll() {
        return estadoRepository.findAllByOrderByNome();
    }
}
