package Herança.atividade01;

import javax.swing.JOptionPane;

public class Moto extends Veiculo{
    
    // Atributos
    int cilindradas;
    String tipoDePartida;

    // Construtor
    public Moto(){

        obterDados();
        mensagem();
        
    }

    private void obterDados(){

        fabricante = JOptionPane.showInputDialog(null, "Informe o fabricante");
        modelo = JOptionPane.showInputDialog(null, "Informe o modelo");
        cor = JOptionPane.showInputDialog(null, "Informe a cor");
        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano"));
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));
        cilindradas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe as cilindradas"));
        tipoDePartida = JOptionPane.showInputDialog(null, "Informe o tipo de partida");
    }

    private void mensagem(){
        String texto = "Fabricante: "+fabricante;
               texto += "\nModelo: "+modelo;
               texto += "\nCor: "+cor;
               texto += "\nAno: "+ano;
               texto += "\nValor: "+valor;
               texto += "\nCilindradas: "+cilindradas;
               texto += "\nTipo de partida: "+tipoDePartida;

        JOptionPane.showMessageDialog(null, texto);
    }

}