package br.marmitafitnes.repository;

import br.marmitafitnes.model.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

}
