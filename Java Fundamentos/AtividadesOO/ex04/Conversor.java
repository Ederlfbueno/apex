package AtividadesOO.ex04;

import javax.swing.JOptionPane;

public class Conversor {

    // Atributos
	private double valor;
    private int tipoConversao;

	// Métodos
	public Conversor(){
        obterDados();
        escolherConversao();
    }

    private void obterDados(){
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor que deseja converter"));
        tipoConversao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Real para Dólar \n2)Dílar para Real \n3)Real para Euro \n4)Euro para Real"));
    }

	private void escolherConversao(){
        switch(tipoConversao){
            case 1:
            JOptionPane.showMessageDialog(null, realParaDolar());
            break;

            case 2:
            JOptionPane.showMessageDialog(null, dolarParaReal());
            break;

            case 3:
            JOptionPane.showMessageDialog(null, realParaEuro());
            break;

            case 4:
            JOptionPane.showMessageDialog(null, euroParaReal());
            break;
        }
    }

	private double realParaDolar(){
        return valor / 5.5;
    }

	private double dolarParaReal(){
        return valor * 5.5;
    }

	private double realParaEuro(){
        return valor / 6.5;
    }

	private double euroParaReal(){
        return valor * 6.5;
    }

    
}
