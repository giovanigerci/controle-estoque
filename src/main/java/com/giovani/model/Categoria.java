package com.giovani.model;

import com.giovani.model.enums.TipoEmbalagem;
import com.giovani.model.enums.Tamanho;

public class Categoria {
    private int id;
    private String nome;
    private Tamanho tamanho;
    private TipoEmbalagem embalagem;

    public Categoria(){
    }
    public Categoria(int id, String nome, Tamanho tamanho, TipoEmbalagem embalagem){
        this.id = id;
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
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
    public Tamanho getTamanho() {
        return tamanho;
    }
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
    public TipoEmbalagem getEmbalagem() {
        return embalagem;
    }
    public void setEmbalagem(TipoEmbalagem embalagem) {
        this.embalagem = embalagem;
    }

    @Override
    public String toString() {
        return "Categoria{id=" + id + ", nome" + nome + ", tamanho" + tamanho + ", embalagem=" + embalagem + "}";
    }

}
