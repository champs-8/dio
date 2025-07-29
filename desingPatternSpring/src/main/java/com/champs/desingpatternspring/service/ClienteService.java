package com.champs.desingpatternspring.service;

import com.champs.desingpatternspring.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    Iterable<Cliente> findAll();
    Cliente findById(Long id);
    void save(Cliente cliente);
    void deleteById(Long id);
    void update(Long id, Cliente cliente);
}
