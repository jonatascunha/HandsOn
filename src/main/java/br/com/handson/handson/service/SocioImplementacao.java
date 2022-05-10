package br.com.handson.handson.service;

import br.com.handson.handson.model.request.SocioRequestDTO;
import br.com.handson.handson.model.response.SocioResponseDTO;
import br.com.handson.handson.persistence.entity.Socio;
import br.com.handson.handson.persistence.repository.SocioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SocioImplementacao implements SocioInterface {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private SocioRepository socioRepository;

    @Override
    public SocioResponseDTO create(SocioRequestDTO socioRequestDTO) {
        Socio socio = modelMapper.map(socioRequestDTO, Socio.class);
        socio = socioRepository.saveAndFlush(socio);
        return modelMapper.map(socio, SocioResponseDTO.class);
    }
    @Override
    public Optional<SocioResponseDTO> getById(Long id) {
        Optional<Socio> socio = socioRepository.findById(id);
        if(socio.isPresent()) {
            SocioResponseDTO dto = modelMapper.map(socio, SocioResponseDTO.class);
            return Optional.of(dto);
        }
        return Optional.empty();
    }
}
