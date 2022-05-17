package Herança.atividade02;

import javax.swing.JOptionPane;

public class PessoaFisica extends ContaBancaria{
    
    // Atributos
    String cpf, nome;
    
    public PessoaFisica() {
    	this.obterDados();
    	this.mostraDadosInformados();
    }
    
    private void obterDados() {
        nome = JOptionPane.showInputDialog(null, "Informe o nome ");
        cpf  = JOptionPane.showInputDialog(null, "Informe o cpf ");
        contaCorrente = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a conta corrente "));
        agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a agencia "));
        endereco = JOptionPane.showInputDialog(null, "Informe o endreco ");
        email = JOptionPane.showInputDialog(null, "Informe o email ");
        telefone = JOptionPane.showInputDialog(null, "Informe o telefone");
        senha = JOptionPane.showInputDialog(null, "Informe a senha");
    }
    
    private void mostraDadosInformados() {
    	String texto = "Nome: " + nome 
    			     + "Cpf: " + cpf 
    			     + "Conta: " + contaCorrente
    			     + "Agencia:" + agencia
    			     + "Endereco: " + endereco
    			     + "Email: " + email
    			     + "Telefone: " + telefone;
    	
    	JOptionPane.showMessageDialog(null, texto);
    	
    }
}
