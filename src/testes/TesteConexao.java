package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) {
        try (Connection conexao = ConexaoBD.getConnection()) {
            System.out.println("✅ Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar: " + e.getMessage());
        }
    }
}
