package br.com.handson.handson.ws;

import br.com.handson.handson.model.request.LojaRequestDTO;
import br.com.handson.handson.model.request.ProdutoRequestDTO;
import br.com.handson.handson.model.response.LojaResponseDTO;
import br.com.handson.handson.model.response.ProdutoResponseDTO;
import br.com.handson.handson.service.ProdutoInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/produto")
public class ProdutoController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProdutoInterface produtoService;

    @PostMapping
    public ResponseEntity<ProdutoResponseDTO> create(@RequestBody ProdutoRequestDTO produtoRequestDTO) {
        return ResponseEntity.ok(produtoService.create(produtoRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponseDTO> getByid(@PathVariable("id") Long id) {
        Optional<ProdutoResponseDTO> produtoResponseDTO = produtoService.getById(id);
        if (!produtoResponseDTO.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produtoResponseDTO.get());
    }






}
