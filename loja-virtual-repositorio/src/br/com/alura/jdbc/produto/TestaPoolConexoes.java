package br.com.alura.jdbc.produto;
import java.sql.SQLException;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();

		for (int i = 0; i < 20; i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conex�o de n�mero: " + i);
		}
	}
}
