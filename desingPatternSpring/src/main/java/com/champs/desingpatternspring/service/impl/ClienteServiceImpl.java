package com.champs.desingpatternspring.service.impl;

import com.champs.desingpatternspring.model.Cliente;
import com.champs.desingpatternspring.model.Endereco;
import com.champs.desingpatternspring.repository.ClienteRepository;
import com.champs.desingpatternspring.repository.EnderecoRepository;
import com.champs.desingpatternspring.service.ClienteService;
import com.champs.desingpatternspring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    //TODO Singleton: Injetar os componente do Spring com o @Autowired
    //TODO Strategy:Implementar os metodo definidos na interface ClienteService
    //TODO Facade: Abstrair intregrações com subsistemas, provendo interface simples

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) { //pode ou nao existir
        return clienteRepository.findById(id);
    }

    @Override
    public void save(Cliente cliente) {
        //verificar se o endereço já existe no banco de dados
        salvarEnderecoCliente(cliente);
    }


    @Override
    public void update(Long id, Cliente cliente) {
        Optional<Cliente> clienteId = clienteRepository.findById(id);
        if (clienteId.isPresent()) {
            salvarEnderecoCliente(cliente);
        }
    }

    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarEnderecoCliente(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep)
                .orElseGet(() -> {
                    return null;
                });
        if (endereco == null) {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
        }
        //salva o cliente com o endereço
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}
