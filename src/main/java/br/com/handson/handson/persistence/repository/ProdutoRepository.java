package br.com.handson.handson.persistence.repository;

import br.com.handson.handson.persistence.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
