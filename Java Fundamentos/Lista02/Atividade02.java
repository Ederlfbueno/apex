package Lista02;

import javax.swing.JOptionPane;

public class Atividade02 {
    
    public static void main(String[] args) {
        
        // Obter um número
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

        // Incrementar e decrementar valores
        int menor = numero - 10;
        int maior = numero + 10;

        // Estrutura
        String estrutura = "";

        // Laço
        do{
            estrutura += menor + "\n";
            menor++;
        }while(menor <= maior);

        // Exibir estrutura
        JOptionPane.showMessageDialog(null, estrutura);

    }

}
