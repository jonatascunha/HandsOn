package br.com.handson.handson.persistence.entity;

import javax.persistence.*;
import java.util.List;

public class Socio {
    @Id
    @GeneratedValue
    @Column(name = "idProduto", nullable = false)
    private Long idSocio;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "idade", nullable = false)
    private int idade;
    @Column(name = "cpf", nullable = false)
    private int cpf;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
     name = "socio_loja",
      joinColumns = {@JoinColumn(name = "socio_id")},
       inverseJoinColumns = {@JoinColumn(name = "loja_id")})
    private List<Loja> lojas;

    public List<Loja> getLojas() {
        return lojas;
    }

    public void setLojas(List<Loja> lojas) {
        this.lojas = lojas;
    }

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


}
