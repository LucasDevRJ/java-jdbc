package br.com.alura.jdbc.produto;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// Cria conex�o com o banco de dados
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		System.out.println("Fechando conex�o!!!");

		connection.close();
	}
}
