package br.marmitafitnes.model;

import java.io.Serializable;

public interface IEntity extends Serializable {
    Long getId();
    void setId(Long id);
}
