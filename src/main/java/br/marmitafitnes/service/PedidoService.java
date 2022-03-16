package br.marmitafitnes.service;

import br.marmitafitnes.model.Pedido;
import br.marmitafitnes.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;
    public Pedido cadastrar(Pedido pedido) {
      return repository.save(pedido);

    }

}
