package Lista01;

import javax.swing.JOptionPane;

public class Atividade3 {
    
    public static void main(String[] args) {
        
        // Obter notas
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primera nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota"));

        // Média
        double media = (nota1+nota2+nota3)/3;

        // Situação
        String situacao = media >= 7 ? "Aprovado(a)" : "Reprovado(a)";

        // Mensagem
        JOptionPane.showMessageDialog(null, situacao + " com média " + media);

    }

}
