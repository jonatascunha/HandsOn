package br.com.handson.handson.model.response;

import java.util.List;


public class LojaResponseDTO {


    private Long id;

    private String nome;

    private List<ProdutoResponseDTO> produtos;

    private List<SocioResponseDTO> socios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoResponseDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoResponseDTO> produtos) {
        this.produtos = produtos;
    }

    public List<SocioResponseDTO> getSocios() {
        return socios;
    }

    public void setSocios(List<SocioResponseDTO> socios) {
        this.socios = socios;
    }
}
