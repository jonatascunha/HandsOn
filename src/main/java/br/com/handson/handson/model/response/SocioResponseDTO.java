package br.com.handson.handson.model.response;

import java.util.List;

public class SocioResponseDTO {

    private Long idSocio;
    private String nome;
    private int idade;

    private int cpf;

    private List<LojaResponseDTO> lojas;

    public Long getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Long idSocio) {
        this.idSocio = idSocio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<LojaResponseDTO> getLojas() {
        return lojas;
    }

    public void setLojas(List<LojaResponseDTO> lojas) {
        this.lojas = lojas;
    }
}
