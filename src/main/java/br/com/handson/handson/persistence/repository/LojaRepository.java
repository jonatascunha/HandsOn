package br.com.handson.handson.persistence.repository;

import br.com.handson.handson.persistence.entity.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LojaRepository extends JpaRepository<Loja, Long> {
}
