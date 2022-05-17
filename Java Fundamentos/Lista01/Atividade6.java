package Lista01;

import javax.swing.JOptionPane;

public class Atividade6 {
    public static void main(String[] args) {
        
        // Menu
        String menu = "Escolha uma cidade";
               menu+= "\n1) Lisboa";
               menu+= "\n2) Barcelona";
               menu+= "\n3) Nova Iorque";

        // Obter a cidade
        int cidade = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        // Obter o horário de Brasília
        int horario = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o horário de Brasília"));

        // Retorno
        JOptionPane.showMessageDialog(null, cidade == 1 ? horario+3 : cidade == 2 ? horario+4 : horario+2);

    }

}
