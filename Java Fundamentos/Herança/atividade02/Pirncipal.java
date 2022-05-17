package Herança.atividade02;

import javax.swing.JOptionPane;

public class Pirncipal {

	public static void main(String[] args) {
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcao desejada"
				+ "\n 1 - PF"
				+ "\n 2 - Pj \n"));
		
		if (option == 1) {
			PessoaFisica pf = new PessoaFisica();
		} else {
			PessoaJuridica pf = new PessoaJuridica();
		}
		
	}
}
