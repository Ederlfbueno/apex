package Lista02;

import javax.swing.JOptionPane;

public class Atividade01 {
    
    public static void main(String[] args) {
        
        // Obter um número
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

        // Índice
        int indice = 0;

        // Tabuada
        String tabuada = "A tabuada de " + numero + " é:\n";

        // Laço
        do{
            tabuada += numero + " X " + indice + " = " + (numero*indice) + "\n";
            indice++;
        }while(indice < 11);

        // Exibir tabuada
        JOptionPane.showMessageDialog(null, tabuada);

    }

}
