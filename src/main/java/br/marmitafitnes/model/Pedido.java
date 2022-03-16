package br.marmitafitnes.model;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "pedido")
public class Pedido implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "cardapio_id")
    private Cardapio cardapio;
    private BigDecimal valor;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;

    }
}
