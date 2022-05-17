package Heran�a.atividade01;

import javax.swing.JOptionPane;

public class Carro extends Veiculo{
    
    // Atributos
    int motor;
    boolean tetoSolar, direcaoHidraulica;

    // Construtor
    public Carro(){

        obterDados();
        mensagem();
        
    }

    private void obterDados(){
        fabricante = JOptionPane.showInputDialog(null, "Informe o fabricante");
        modelo = JOptionPane.showInputDialog(null, "Informe o modelo");
        cor = JOptionPane.showInputDialog(null, "Informe a cor");
        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano"));
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));
        motor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe as cilindradas"));
        String ts = JOptionPane.showInputDialog(null, "Possui teto solar? sim/não");
        tetoSolar = ts.equals("sim") ? true : false;
        String dh = JOptionPane.showInputDialog(null, "Possui direção hidráulica? sim/não");
        direcaoHidraulica = dh.equals("sim") ? true : false;
    }

    private void mensagem(){
        String texto = "Fabricante: "+fabricante;
               texto += "\nModelo: "+modelo;
               texto += "\nCor: "+cor;
               texto += "\nAno: "+ano;
               texto += "\nValor: "+valor;
               texto += "\nMotor: "+motor;
               texto += "\nTeto Solar: "+(tetoSolar == true ? "Sim" : "Não");
               texto += "\nDirecão Hidráulica: "+(direcaoHidraulica == true ? "Sim" : "Não");

        JOptionPane.showMessageDialog(null, texto);
    }
}
