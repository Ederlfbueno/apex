package Herança.exemplo02;

import javax.swing.JOptionPane;

public class Colaborador {
    
    // Atributos
    String nome;
    double salario;
    int faltas;

    // Construtor
    public Colaborador(){
        nome = JOptionPane.showInputDialog(null, "Informe o nome");
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salÃ¡rio"));
        faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe as faltas"));
    }

}
