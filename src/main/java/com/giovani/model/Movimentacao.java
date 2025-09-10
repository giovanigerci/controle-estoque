package com.giovani.model;

import com.giovani.model.enums.TipoMovimentacao;

import java.time.LocalDate;

public class Movimentacao {
    private int id;
    private Produto produto;
    private LocalDate data_movimentacao;
    private int quantidade;
    private TipoMovimentacao tipo;

    public Movimentacao() {

    }
    public Movimentacao(int id, Produto produto, LocalDate data_movimentacao, int quantidade, TipoMovimentacao tipo) {
        this.id = id;
        this.produto = produto;
        this.data_movimentacao = data_movimentacao;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public LocalDate getData_movimentacao() {
        return data_movimentacao;
    }

    public void setData_movimentacao(LocalDate data_movimentacao) {
        this.data_movimentacao = data_movimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimentacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "id=" + id +
                ", produto=" + produto +
                ", dataMovimentacao=" + data_movimentacao +
                ", quantidade=" + quantidade +
                ", tipo='" + tipo + "}";
    }


}
