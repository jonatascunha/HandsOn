package br.com.handson.handson.service;

import br.com.handson.handson.model.request.LojaRequestDTO;
import br.com.handson.handson.model.response.LojaResponseDTO;
import br.com.handson.handson.persistence.entity.Loja;
import br.com.handson.handson.persistence.repository.LojaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LojaImplementacao implements LojaInterface {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private LojaRepository lojaRepository;

    @Override
    public LojaResponseDTO create(LojaRequestDTO lojaRequestDTO) {
        Loja loja = modelMapper.map(lojaRequestDTO, Loja.class);
        loja = lojaRepository.saveAndFlush(loja);
        return modelMapper.map(loja, LojaResponseDTO.class);
    }
    @Override
    public Optional<LojaResponseDTO> getById(Long id) {
        Optional<Loja> loja = lojaRepository.findById(id);
        if(loja.isPresent()) {
            LojaResponseDTO dto = modelMapper.map(loja, LojaResponseDTO.class);
            return Optional.of(dto);
        }
        return Optional.empty();
    }
}
