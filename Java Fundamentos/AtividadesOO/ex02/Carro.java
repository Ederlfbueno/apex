package AtividadesOO.ex02;

import javax.swing.JOptionPane;

public class Carro {
    
    // Atributos
    private String modelo;
    private double valor;

    // Construtor
    public Carro(){
        obterDados(); // 1 passo 
        mensagem();
    }

    private void obterDados(){
        modelo = JOptionPane.showInputDialog(null, "Informe o modelo");
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do veiculo"));
    }

    private double impostos(){
        return valor <= 10000 ? valor * 0.1 : valor <= 20000 ? valor * 0.15 : valor * 0.20;      
    }

    private void mensagem(){
    	String texto =  "O valor a ser pago: " + modelo + " será de R$ " + impostos() + "    ";
    	JOptionPane.showMessageDialog(null, texto);
    }
    
}
