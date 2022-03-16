package br.marmitafitnes.service;

import br.marmitafitnes.model.Cliente;
import br.marmitafitnes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;
    public Cliente cadastrar(Cliente cliente) {
        return repository.save(cliente);
    }
}
