package AtividadesArrayList.atividade04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
       
        // ArrayList
        ArrayList<Produto> dados = new ArrayList<Produto>();

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
                
                    Produto p = new Produto();
                    p.nome = JOptionPane.showInputDialog(null, "Informe o nome");
                    p.marca = JOptionPane.showInputDialog(null, "Informe a marca");
                    p.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));

                    dados.add(p);

                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                break;

                case 2:
                
                    // Lista de pessoas
                    String lista = "Produtos cadastrados\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        lista += "\nNome: " + dados.get(i).nome;
                        lista += "\nMarca: " + dados.get(i).marca;
                        lista += "\nValor: " + dados.get(i).valor;
                        lista += "\n-----------";
                    }

                    // Exbir lista
                    JOptionPane.showMessageDialog(null, lista);

                break;

                case 3:

                    // Lista de nomes
                    String nomes = "Selecione o produto\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        nomes += (i+1) + ")" + dados.get(i).nome + "\n";
                    }
                
                    // Obter o índice
                    int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomes));

                    // Remove
                    dados.remove(indice-1);

                    // Mensagem
                    JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");

                break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Sair");
                    continuar = false;
                break;
            }

        }while(continuar == true);

    }

}
