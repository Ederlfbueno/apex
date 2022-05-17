package AtividadesOO.ex05;

import javax.swing.JOptionPane;

public class Numero {

    // Atributos
	private int numero1, numero2, numero3;

	// Métodos
    public Numero(){
        obterNumero();
        JOptionPane.showMessageDialog(null, "O menor número é " + menorNumero());
    }
	

	private void obterNumero(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1º número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "2º número"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "3º número"));
    }
	
    private int menorNumero(){
        int menor = numero1;

        if(numero2 < menor){
            menor = numero2;
        }

        if(numero3 < menor){
            menor = numero3;
        }

        return menor;
    }

}
