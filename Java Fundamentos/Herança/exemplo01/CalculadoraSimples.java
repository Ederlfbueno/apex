package Heran�a.exemplo01;

import javax.swing.JOptionPane;

public class CalculadoraSimples{
    int n1; 
    int n2; 
    // Soma
        
    private void obterDados() {
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número"));
    }
    
    public void soma(){
    	
    	this.obterDados();
    
        JOptionPane.showMessageDialog(null, "A soma � " + (n1+n2));
    }

    public void subtracao(){
    	this.obterDados();
        JOptionPane.showMessageDialog(null, "A subtra��o � " + (n1-n2));
    }
    
    // Multiplicação
    public void multiplicacao(){
    	this.obterDados();
    
        JOptionPane.showMessageDialog(null, "A multiplica��o � " + (n1*n2));
    }
    
    // Divisão
    public void divisao(){
    	this.obterDados();
    
        JOptionPane.showMessageDialog(null, "A divisao � " + (n1/n2));
    }

}
