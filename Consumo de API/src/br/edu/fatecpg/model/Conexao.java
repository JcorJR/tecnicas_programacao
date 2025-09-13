package br.edu.fatecpg.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() {
        try {
            var jdbcUrl = "jdbc:postgresql://localhost:5432/db_fatec";
            var user = "postgres";
            var senha = "123";

            return DriverManager.getConnection(jdbcUrl, user, senha);
        } catch (SQLException e) {
            System.out.println("Erro ao Conectar no Banco");
            e.printStackTrace();
            return null;
        }
    }
}
