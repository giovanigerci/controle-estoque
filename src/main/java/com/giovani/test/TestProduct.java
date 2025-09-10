package com.giovani.test;

import com.giovani.model.Categoria;
import com.giovani.model.Produto;
import com.giovani.model.enums.TipoEmbalagem;
import com.giovani.model.enums.Tamanho;

public class TestProduct {
    public static void main(String args[]){
        Categoria categoria = new Categoria(1, "Alimento", Tamanho.MEDIO, TipoEmbalagem.LATA);

        Produto produto = new Produto(
                1,"Arroz", 5.50, "kg",
                100, 10, 200, categoria
        );

        System.out.println(produto);
    }
}
