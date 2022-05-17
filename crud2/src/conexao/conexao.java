package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
	
	public Connection conectar() {
		
		Connection retornoConexao = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/crud";
			String username = "root";
			String password = "abc123";
			
			
			retornoConexao = DriverManager.getConnection(url, username, password);
			
			System.out.println("Conectado com sucesso");
			
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		return retornoConexao;
		
	}
}
