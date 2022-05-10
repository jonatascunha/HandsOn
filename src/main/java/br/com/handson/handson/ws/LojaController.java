package br.com.handson.handson.ws;


import br.com.handson.handson.model.request.LojaRequestDTO;
import br.com.handson.handson.model.response.LojaResponseDTO;
import br.com.handson.handson.service.LojaInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/loja")
public class LojaController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private LojaInterface lojaService;

    @PostMapping
    public ResponseEntity<LojaResponseDTO> create(@RequestBody LojaRequestDTO lojaRequestDTO) {
        return ResponseEntity.ok(lojaService.create(lojaRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LojaResponseDTO> getByid(@PathVariable("id") Long id) {
        Optional<LojaResponseDTO> lojaResponseDTO = lojaService.getById(id);
        if (!lojaResponseDTO.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lojaResponseDTO.get());
    }


}
