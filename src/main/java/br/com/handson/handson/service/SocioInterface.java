package br.com.handson.handson.service;

import br.com.handson.handson.model.request.SocioRequestDTO;
import br.com.handson.handson.model.response.SocioResponseDTO;

import java.util.Optional;

public interface SocioInterface {
    SocioResponseDTO create(SocioRequestDTO socioRequestDTO);
    Optional<SocioResponseDTO> getById(Long id);

}
