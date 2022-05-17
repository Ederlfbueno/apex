package AtividadesOO.ex07;

import javax.swing.JOptionPane;

@SuppressWarnings("all")
public class Numeros {
    
    // Atributos
	int numero1, numero2;

	// Métodos
	public Numeros(){
        obterDados();
    }

	private void obterDados(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 1º número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 1º número"));

        int positivos = 0;
        int negativos = 0;
        int pares = 0;
        int impares = 0;

        while(numero1 <= numero2){
            pares += qtdPares(numero1);
            impares += qtdImpares(numero1);
            positivos += qtdPositivos(numero1);
            negativos += qtdNegativos(numero1);
            numero1++;
        }
    }

	private int qtdPares(int numero){
        return numero % 2 == 0 ? 1 : 0;
    }

	private int qtdImpares(int numero){
        return numero % 2 != 0 ? 1 : 0;
    }

	private int qtdPositivos(int numero){
        return numero % 2 != 0 ? 1 : 0;
    }

	private int qtdNegativos(int numero){
        return numero % 2 != 0 ? 1 : 0;
    }

	private void mensagem(){

    }


}
