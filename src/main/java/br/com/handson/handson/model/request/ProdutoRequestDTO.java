package br.com.handson.handson.model.request;

public class ProdutoRequestDTO {

    private Long idProduto;
    private String nomeProduto;
    private double precoProduto;
    private String descricao;

    private LojaRequestDTO loja;

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

    public LojaRequestDTO getLoja() {
        return loja;
    }

    public void setLoja(LojaRequestDTO loja) {
        this.loja = loja;
    }
}
