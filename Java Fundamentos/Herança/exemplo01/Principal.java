package Herança.exemplo01;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
       CalculadoraSimples c = new CalculadoraSimples();
       int opcao = 5; 
       
       while ( opcao != 0) {
           opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a opcao\n "
           		+ "1 - Soma\n 2- Subtracao\n "
           		+ "3 - Multiplicacao\n"
           		+ "4 - Divisao\n"
           		+ "0 - Sair"));
    	   
           switch (opcao) {
           	  case 1:
           		  c.soma();
           		  break;
           	  case 2:
           		  c.subtracao();
           		  break;
           	  case 3:
           		  c.multiplicacao();
           		  break;
           	  case 4:
           		  c.divisao();
           		  break;
       		  default:
           }
       }
        

    }

}
