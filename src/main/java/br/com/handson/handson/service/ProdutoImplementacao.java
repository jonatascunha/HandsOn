package br.com.handson.handson.service;

import br.com.handson.handson.model.request.LojaRequestDTO;
import br.com.handson.handson.model.request.ProdutoRequestDTO;
import br.com.handson.handson.model.response.LojaResponseDTO;
import br.com.handson.handson.model.response.ProdutoResponseDTO;
import br.com.handson.handson.persistence.entity.Loja;
import br.com.handson.handson.persistence.entity.Produto;
import br.com.handson.handson.persistence.repository.LojaRepository;
import br.com.handson.handson.persistence.repository.ProdutoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoImplementacao implements ProdutoInterface{
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProdutoRepository produtoRepository;


    @Override
    public ProdutoResponseDTO create(ProdutoRequestDTO produtoRequestDTO) {
        Produto produto = modelMapper.map(produtoRequestDTO, Produto.class);
        produto = produtoRepository.saveAndFlush(produto);
        return modelMapper.map(produto, ProdutoResponseDTO.class);
    }

    @Override
    public Optional<ProdutoResponseDTO> getById(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if(produto.isPresent()) {
            ProdutoResponseDTO dto = modelMapper.map(produto, ProdutoResponseDTO.class);
            return Optional.of(dto);
        }
        return Optional.empty();
    }
}
