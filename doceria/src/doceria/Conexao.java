package doceria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/doceria?useTimezone=true&serverTimezone=UTC", "root", "root");
		
		System.out.println("Conex�o conclu�da com sucesso!");
		
		conexao.close();
		System.out.println("Conex�o fechada!");
	}
}
