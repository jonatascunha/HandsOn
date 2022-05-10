package br.com.handson.handson.service;

import br.com.handson.handson.model.request.LojaRequestDTO;
import br.com.handson.handson.model.response.LojaResponseDTO;

import java.util.Optional;

public interface LojaInterface {
    LojaResponseDTO create(LojaRequestDTO lojaRequestDTO);
    Optional<LojaResponseDTO> getById(Long id);
}
