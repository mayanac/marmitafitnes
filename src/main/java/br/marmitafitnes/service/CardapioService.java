package br.marmitafitnes.service;

import antlr.collections.impl.LList;
import br.marmitafitnes.model.Cardapio;
import br.marmitafitnes.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class CardapioService {
    @Autowired
    private  CardapioRepository repository;
    public Cardapio cadastrar ( Cardapio cardapio) {
        return repository.save(cardapio);
    }
    public List<Cardapio> listar() {
        return repository.findAll();

    }


}
