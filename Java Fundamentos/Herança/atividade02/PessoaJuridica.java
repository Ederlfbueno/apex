package Herança.atividade02;

import javax.swing.JOptionPane;

public class PessoaJuridica extends ContaBancaria{

    // Atributos
    String cnpj, nomeEmpresa, responsavelEmpresa;

    public PessoaJuridica() {
    	this.obterDados();
    	this.mostraDadosInformados();
    }
    
    private void obterDados() {
    	nomeEmpresa = JOptionPane.showInputDialog(null, "Informe o nome da empresa ");
    	responsavelEmpresa = JOptionPane.showInputDialog(null, "Informe o nome do responsavel pela empresa ");
        cnpj  = JOptionPane.showInputDialog(null, "Informe o cnpj ");
        contaCorrente = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a conta corrente "));
        agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a agencia "));
        endereco = JOptionPane.showInputDialog(null, "Informe o endreco ");
        email = JOptionPane.showInputDialog(null, "Informe o email ");
        telefone = JOptionPane.showInputDialog(null, "Informe o telefone");
        senha = JOptionPane.showInputDialog(null, "Informe a senha");
    }
    
    private void mostraDadosInformados() {
    	String texto = "Nome empresa: " + nomeEmpresa 
    				 + "responsavelEmpresa: " + responsavelEmpresa 
    			     + "cnpj: " + cnpj 
    			     + "Conta: " + contaCorrente
    			     + "Agencia:" + agencia
    			     + "Endereco: " + endereco
    			     + "Email: " + email
    			     + "Telefone: " + telefone;
    	
    	JOptionPane.showMessageDialog(null, texto);
    	
    }
    
}
