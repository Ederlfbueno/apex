package Lista01;

import javax.swing.JOptionPane;

public class Atividade08 {
    
    public static void main(String[] args) {

        // Obter números
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro número"));
        
        // Criar a variável menor e definir o primeiro número como o menor.
        int menor = numero1;
        
        // Comparar a variável menor com o segundo número
        menor = numero2 < menor ? numero2 : menor;

        // Comparar variável menor com o terceiro número
        menor = numero3 < menor ? numero3 : menor;

        // Exibir o menor número
        JOptionPane.showMessageDialog(null, "O menor número informado é: "+menor);

    }

}
