package AtividadesOO.ex03;

import javax.swing.JOptionPane;

public class Numero {

    // Atributo
    private int numero;

    // Construtor
    public Numero(){
        obterNumero();
        JOptionPane.showMessageDialog(null, calculo());
    }

    // Obter número
    private void obterNumero(){
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"));
    }

    // calculo
    private String calculo(){
        String estrutura = "";

        int indice = 0;
        
        while(indice < 11 ){
            estrutura += numero + " X " + indice + " = " + calculo(numero,indice) + "\n";
            indice++;
        }

        return estrutura;
    }
    
    private int calculo(int numero, int multiplicador ) {
    	return numero*multiplicador;
    }
    
    private int getNumero() {
    	return numero; 
    }
    
    private void setNumero(int numero) { 
    	this.numero = numero; 
    }
    
}

