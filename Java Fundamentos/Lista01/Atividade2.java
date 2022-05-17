package Lista01;

import javax.swing.JOptionPane;

/**
 * Atividade2
 */

public class Atividade2 {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

        String mensagem = numero < 0 ? "Negativo" : "Positivo";

        mensagem += "\n";

        mensagem += numero % 2 == 0 ? "Par" : "Ímpar";

        JOptionPane.showMessageDialog(null, mensagem);


    }
    
}