package AtividadesArrayList.atividade03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
       
        // ArrayList
        ArrayList<Aluno> dados = new ArrayList<Aluno>();

        // Menu
        String menu = "O que deseja fazer?\n";
               menu+= "1) Cadastrar\n";
               menu+= "2) Listar\n";
               menu+= "3) Remover\n";
               menu+= "4) Sair";

        // Variável para sair do laço
        boolean continuar = true;
        
        // Laço
        do{

            // Obter a opção
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            // Escolha
            switch(opcao){
                case 1:
                
                    Aluno a = new Aluno();
                    a.nome = JOptionPane.showInputDialog(null, "Informe o nome");
                    a.nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota"));
                    a.nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota"));
                    a.media = (a.nota1 + a.nota2) / 2;
                    a.situacao = a.media >= 7 ? "Aprovado(a)" : a.media >= 5 ? "Em exame" : "Reprovado(a)";
 
                    dados.add(a);

                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                break;

                case 2:
                
                    // Lista de pessoas
                    String lista = "Alunos cadastrados\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        lista += "\nNome: " + dados.get(i).nome;
                        lista += "\nPrimeira nota: " + dados.get(i).nota1;
                        lista += "\nSegunda nota: " + dados.get(i).nota2;
                        lista += "\nMédia: " + dados.get(i).media;
                        lista += "\nSituação: " + dados.get(i).situacao;
                        lista += "\n-----------";
                    }

                    // Exbir lista
                    JOptionPane.showMessageDialog(null, lista);

                break;

                case 3:

                    // Lista de nomes
                    String nomes = "Selecione o aluno\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        nomes += (i+1) + ")" + dados.get(i).nome + "\n";
                    }
                
                    // Obter o índice
                    int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomes));

                    // Remove
                    dados.remove(indice-1);

                    // Mensagem
                    JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");

                break;

                case 4:
                JOptionPane.showMessageDialog(null, "Sair");
                continuar = false;
                break;
            }

        }while(continuar == true);

    }

}
