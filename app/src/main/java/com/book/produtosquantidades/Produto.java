package com.book.produtosquantidades;

public class Produto {

    private String nomeProduto;
    private String categoria;
    private long   quantidade;
    private long   valor;

    public Produto() {}

    public Produto(String nomeProduto, String categoria, long quantidade, long valor) {

        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }
}
