package principal;

import conexao.conexao;

public class principal {
	public static void main(String[] args) {
		
		conexao obj = new conexao();
		
		obj.conectar();
	}
}
