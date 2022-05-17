package Lista03;

import javax.swing.JOptionPane;

public class Atividade01 {
    
    public static void main(String[] args) {
        
        // Obter os cinco números
        int[] numeros = new int[5];
        for(int i=0; i<5; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o " + (i+1) +"º número."));
        }

        // Estrutura
        String estrutura = "";

        // Colocar os números em ordem contrária
        for(int i=4; i>=0; i--){
            estrutura += numeros[i]  + "\n";
        }

        // Exibir os valores em ordem inversa
        JOptionPane.showMessageDialog(null, estrutura);

    }

}
