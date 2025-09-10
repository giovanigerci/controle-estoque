package com.giovani.test;

import com.giovani.model.Categoria;
import com.giovani.model.Produto;

public class TestProduct {
    public static void main(String args[]){
        Categoria categoria = new Categoria(1, "Alimento", "Médio", "Plastico");

        Produto produto = new Produto(
                1,"Arroz", 5.50, "kg",
                100, 10, 200, categoria
        );

        System.out.println(produto);
    }
}
