package br.com.handson.handson.service;

import br.com.handson.handson.model.request.ProdutoRequestDTO;
import br.com.handson.handson.model.response.ProdutoResponseDTO;

import java.util.Optional;

public interface ProdutoInterface {
    ProdutoResponseDTO create(ProdutoRequestDTO produtoRequestDTO);
    Optional<ProdutoResponseDTO> getById(Long id);
}
