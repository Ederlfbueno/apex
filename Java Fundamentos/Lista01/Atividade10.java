package Lista01;

import javax.swing.JOptionPane;

public class Atividade10 {
    
    public static void main(String[] args) {

        // Obter dados
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor que deseja converter?"));
        int tipoConversao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Real para dólar \n2) Real para Euro \n3)Dólar para Real \n4) Euro para real"));

        // Valor convertido
        double valorConversao = 0;

        // Símbolo monetário
        String simboloConversao = "";

        // Incrementa ou decrementa a hora, dependendo da cidade escolhida
        switch(tipoConversao){
            case 1:
                valorConversao = valor / 5.5;
                simboloConversao = "US$ ";
            break;

            case 2:
                valorConversao = valor / 6.5;
                simboloConversao = "€ ";
            break;

            case 3:
                valorConversao = valor * 5.5;
                simboloConversao = "R$ ";
            break;

            case 4:
                valorConversao = valor * 6.5;
                simboloConversao = "R$ ";
            break;
        }

        // Retorno
        JOptionPane.showMessageDialog(null, simboloConversao + valorConversao);

    }

}
