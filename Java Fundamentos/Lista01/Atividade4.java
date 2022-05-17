package Lista01;

import javax.swing.JOptionPane;

public class Atividade4 {
    
    public static void main(String[] args) {
        
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano"));

        JOptionPane.showMessageDialog(null, ano % 4 == 0 ? "É bissexto" : "Não é bissexto");

    }

}
