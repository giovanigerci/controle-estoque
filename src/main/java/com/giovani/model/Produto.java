package com.giovani.model;

public class Produto {
    private int id;
    private String nome;
    private double preco_unitario;
    private String unidade;
    private int qtd_estoque;
    private int qtd_minima;
    private int qtd_maxima;
    private Categoria categoria;

    public Produto() {
    }

    public Produto(int id, String nome, double preco_unitario, String unidade, int qtd_estoque, int qtd_minima, int qtd_maxima, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco_unitario = preco_unitario;
        this.unidade = unidade;
        this.qtd_estoque = qtd_estoque;
        this.qtd_minima = qtd_minima;
        this.qtd_maxima = qtd_maxima;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco_unitario() {
        return preco_unitario;
    }
    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }
    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public int getQtd_estoque() {
        return qtd_estoque;
    }
    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }
    public int getQtd_minima() {
        return qtd_minima;
    }
    public void setQtd_minima(int qtd_minima) {
        this.qtd_minima = qtd_minima;
    }
    public int getQtd_maxima() {
        return qtd_maxima;
    }
    public void setQtd_maxima(int qtd_maxima) {
        this.qtd_maxima = qtd_maxima;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", precoUnitario=" + preco_unitario +
                ", unidade='" + unidade + '\'' +
                ", quantidadeEstoque=" + qtd_estoque +
                ", quantidadeMinima=" + qtd_minima +
                ", quantidadeMaxima=" + qtd_maxima +
                ", categoria=" + categoria +
                '}';
    }
}
