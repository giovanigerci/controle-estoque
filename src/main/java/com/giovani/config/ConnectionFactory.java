package com.giovani.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String Url = "jdbc:mysql://localhost:3306/controle_estoque";
    private static final String User = "root";
    private static final String Password = "1234";

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(Url, User, Password);
        } catch (SQLException e){
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }

    }


}