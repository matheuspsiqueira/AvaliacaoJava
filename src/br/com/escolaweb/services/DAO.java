package br.com.escolaweb.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAO {
    public Connection conn = null;
    private String USER = "root";
    private String HOST = "127.0.0.1";
    private String BASE = "dbescolaweb";
    private String PASS = "";
    private String URL = String.format("jdbc:mysql://%s/%s", HOST, BASE);

    public void Conectar() {
        System.out.println("Conectando ao banco...");
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectado.");
            
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}