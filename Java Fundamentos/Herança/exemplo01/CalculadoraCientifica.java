package Heran�a.exemplo01;

import javax.swing.JOptionPane;

public class CalculadoraCientifica {
    
    // Seno
    public void seno(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

        JOptionPane.showMessageDialog(null, "O seno é " + Math.sin(n1));
    }

    // Tangente
    public void tangente(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

        JOptionPane.showMessageDialog(null, "O seno é " + Math.tan(n1));
    }

}
