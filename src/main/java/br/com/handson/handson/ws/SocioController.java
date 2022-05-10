package br.com.handson.handson.ws;
import br.com.handson.handson.model.request.ProdutoRequestDTO;
import br.com.handson.handson.model.request.SocioRequestDTO;
import br.com.handson.handson.model.response.ProdutoResponseDTO;
import br.com.handson.handson.model.response.SocioResponseDTO;
import br.com.handson.handson.service.SocioInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/socio")
public class SocioController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private SocioInterface socioService;


    @PostMapping
    public ResponseEntity<SocioResponseDTO> create(@RequestBody SocioRequestDTO socioRequestDTO) {
        return ResponseEntity.ok(socioService.create(socioRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SocioResponseDTO> getByid(@PathVariable("id") Long id) {
        Optional<SocioResponseDTO> socioResponseDTO = socioService.getById(id);
        if (!socioResponseDTO.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(socioResponseDTO.get());
    }




}
