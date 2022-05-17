package Lista01;

import javax.swing.JOptionPane;

public class Atividade5 {
    
    public static void main(String[] args) {
        
        // Obter o valor da compra
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da compra"));

        // Obter se pagou à vista ou não
        //int pagamento = JOptionPane.showConfirmDialog(null, "Foi pago a vista?");
          int pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "1) A vista 2) Parcelado"));

        // Condicional
        //if(valor > 500 && pagamento == 0){
        if(valor > 500 && pagamento == 1){
            JOptionPane.showMessageDialog(null, "Total a pagar R$"+(valor*0.9));
        }else{
            JOptionPane.showMessageDialog(null, "Total a pagar R$"+valor);
        }

    }

}
