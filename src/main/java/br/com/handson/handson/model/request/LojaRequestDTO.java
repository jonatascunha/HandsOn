package br.com.handson.handson.model.request;

import java.util.List;


public class LojaRequestDTO {

    private Long id;

    private String nome;

    private List<ProdutoRequestDTO> produtos;

    private List<SocioRequestDTO> socios;

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

    public List<ProdutoRequestDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoRequestDTO> produtos) {
        this.produtos = produtos;
    }

    public List<SocioRequestDTO> getSocios() {
        return socios;
    }

    public void setSocios(List<SocioRequestDTO> socios) {
        this.socios = socios;
    }
}
