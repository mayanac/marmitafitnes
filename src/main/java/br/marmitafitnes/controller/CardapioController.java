package br.marmitafitnes.controller;

import br.marmitafitnes.model.Cardapio;
import br.marmitafitnes.service.CardapioService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cardapio")
public class CardapioController {
    @Autowired
    private CardapioService service;
    @PostMapping
    public ResponseEntity<Cardapio> cadastrar(Cardapio cardapio) {
        Cardapio cardapioSalvo = service.cadastrar(cardapio);
        return  ResponseEntity.ok(cardapioSalvo);

    }
    @GetMapping
    public ResponseEntity<List<Cardapio>> listar() {
        return ResponseEntity.ok(service.listar());

    }

}
