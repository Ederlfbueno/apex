package Lista01;

import javax.swing.JOptionPane;

public class Atividade09 {
    
    public static void main(String[] args) {

        // Obter números
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número"));
        
        // Realizar o cálculo
        int resultado = numero1 == numero2 ? numero1+numero2 : numero1*numero2;

        // Exibir o menor número
        JOptionPane.showMessageDialog(null, "O resultado é: "+resultado);

    }

}
