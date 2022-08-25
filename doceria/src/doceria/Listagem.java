package doceria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Listagem {

	public static void main(String[] args) throws SQLException {
		//Estabelecer a conex�o com o banco
		CriaConexao criaConexao = new CriaConexao();
		Connection conexao = criaConexao.conecta();
		
		//Utilizar comandos do Banco de dados, gerenciando-os
		PreparedStatement stm = conexao.prepareStatement("SELECT ID, NOME, INGREDIENTES FROM DOCE");
		
		//Opera��o l�gica para saber se esta funcionando
		boolean resultado = stm.execute();
		
		System.out.println(resultado);
		
		//Pegar o resultado da lista
		ResultSet itensLista = stm.getResultSet();
		
		System.out.println("Card�pio");
		System.out.println();
		while (itensLista.next()) {
			Integer id = itensLista.getInt("ID");
			String nome = itensLista.getString("NOME");
			String ingredientes = itensLista.getString("INGREDIENTES");
			System.out.println("C�digo: " + id);
			System.out.println("Nome: " + nome);
			System.out.println("Ingredientes: " + ingredientes);
			System.out.println();
		}
		
		conexao.close();
	}
}
