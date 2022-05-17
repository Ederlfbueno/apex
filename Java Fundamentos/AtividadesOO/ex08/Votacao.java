package AtividadesOO.ex08;

import javax.swing.JOptionPane;

public class Votacao {
    
    // Atributos
	private int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;

	// Métodos
	public Votacao(){
        laco();
        mensagem();
    }

	private void laco(){

        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1º Candidato\n 2º Candidato\n 3º Candidato\n 4º Candidato\n 5º Finalizar"));
            
            contabilizarVoto(opcao);
        }while(opcao != 5);

    }

	private void contabilizarVoto(int voto){
        switch(voto){
            case 1: candidato1++; break;
            case 2: candidato2++; break;
            case 3: candidato3++; break;
            case 4: candidato4++; break;
        }
    }

	private void mensagem(){
        String mensagem = "Candidato 1 obteve: "+candidato1+" votos.\n";
               mensagem+= "Candidato 2 obteve: "+candidato2+" votos.\n";
               mensagem+= "Candidato 3 obteve: "+candidato3+" votos.\n";
               mensagem+= "Candidato 4 obteve: "+candidato4+" votos.\n";

        JOptionPane.showMessageDialog(null, mensagem);
    }

}
