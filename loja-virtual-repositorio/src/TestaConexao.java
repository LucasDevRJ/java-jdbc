import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		//Cria conex�o com o banco de dados
		CriaConexao criandoConexao = new CriaConexao();
		Connection connection = criandoConexao.recuperarConexao();
		System.out.println("Fechando conex�o!!!");
		
		connection.close();
	}
}
