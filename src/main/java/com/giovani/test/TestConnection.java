package com.giovani.test;

import com.giovani.config.ConnectionFactory;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        try(Connection conn = ConnectionFactory.getConnection()){
            System.out.println("Conectado");
        } catch(Exception e){
            System.out.println("Erro ao conectar" + e.getMessage());
        }
    }
}
