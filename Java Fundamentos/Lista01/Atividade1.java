package Lista01;

import javax.swing.JOptionPane;

public class Atividade1 {
 
    public static void main(String[] args) {
        
        // Obter nome
        String nome = JOptionPane.showInputDialog(null, "Informe o nome");

        // Obter idade
        String idade = JOptionPane.showInputDialog(null, "Informe o nome");
        
        // Obter cidade
        String cidade = JOptionPane.showInputDialog(null, "Informe o nome");

        // Mensagem
        JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos e mora em " + cidade);
        
    }
    
}
