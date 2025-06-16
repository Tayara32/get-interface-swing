package testes;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConexaoBD {

    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream("config.properties")) {
            props.load(fis);
        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivo de configuração: " + e.getMessage());
            throw new RuntimeException(e);
        }

        String url = props.getProperty("db.url");
        String usuario = props.getProperty("db.usuario");
        String senha = props.getProperty("db.senha");

        return DriverManager.getConnection(url, usuario, senha);
    }
}
