package com.champs.desingpatternspring.service.impl;

import com.champs.desingpatternspring.model.Cliente;
import com.champs.desingpatternspring.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    //TODO Singleton: Injetar os componente do Spring com o @Autowired
    //TODO Strategy:Implementar os metodo definidos na interface ClienteService
    //TODO Facade: Abstrair intregrações com subsistemas, provendo interface simples

    @Override
    public Iterable<Cliente> findAll() {
        return null;
    }

    @Override
    public Cliente findById(Long id) {
        return null;
    }

    @Override
    public void save(Cliente cliente) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Long id, Cliente cliente) {

    }
}
