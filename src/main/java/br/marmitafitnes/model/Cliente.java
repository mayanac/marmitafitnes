package br.marmitafitnes.model;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
