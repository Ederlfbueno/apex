package HeranÁa.exemplo01;

import javax.swing.JOptionPane;

public class CalculadoraSimples{
    int n1; 
    int n2; 
    // Soma
        
    private void obterDados() {
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro n√∫mero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo n√∫mero"));
    }
    
    public void soma(){
    	
    	this.obterDados();
    
        JOptionPane.showMessageDialog(null, "A soma È " + (n1+n2));
    }

    public void subtracao(){
    	this.obterDados();
        JOptionPane.showMessageDialog(null, "A subtraÁ„o È " + (n1-n2));
    }
    
    // Multiplica√ß√£o
    public void multiplicacao(){
    	this.obterDados();
    
        JOptionPane.showMessageDialog(null, "A multiplicaÁ„o È " + (n1*n2));
    }
    
    // Divis√£o
    public void divisao(){
    	this.obterDados();
    
        JOptionPane.showMessageDialog(null, "A divisao È " + (n1/n2));
    }

}
