package br.com.handson.handson.persistence.entity;

import javax.persistence.*;

public class Produto {
    @Id
    @GeneratedValue
    @Column(name = "idProduto", nullable = false)
    private Long idProduto;
    @Column(name = "nomeProduto", nullable = false)
    private String nomeProduto;
    @Column(name = "precoProduto", nullable = false)
    private double precoProduto;
    @Column(name = "descricao", nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "fk_tb_loja", nullable = false)
    private Loja loja;

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
