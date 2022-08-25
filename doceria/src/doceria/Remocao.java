package doceria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Remocao {

	public static void main(String[] args) throws SQLException {
		CriaConexao criaConexao = new CriaConexao();
		Connection conexao = criaConexao.conecta();
		
		//Gerencia os dados recebidos pela conex�o
		PreparedStatement stm = conexao.prepareStatement("DELETE FROM DOCE WHERE ID > ?");
		
		//Setta o atributo ? no statement
		stm.setInt(1, 2);
		
		stm.execute();
	}
}
