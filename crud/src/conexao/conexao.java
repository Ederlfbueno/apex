package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
	
	public Connection conectar() {
		
		Connection retornoConexao = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			String dadosServidor = 
			"jdbc.sqlserver://localhost:1433;databaseName=baseTeste;user=sa;password=abc123";	
			
			retornoConexao = DriverManager.getConnection(dadosServidor);
			
			System.out.println("Conectado com sucesso");
			
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		return retornoConexao;
		
	}
}
