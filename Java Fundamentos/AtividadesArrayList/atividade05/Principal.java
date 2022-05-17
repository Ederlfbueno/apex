package AtividadesArrayList.atividade05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
       
        // ArrayList
        ArrayList<Carro> dados = new ArrayList<Carro>();

        // Menu
        String menu = "O que deseja fazer?\n";
               menu+= "1) Cadastrar\n";
               menu+= "2) Listar\n";
               menu+= "3) Alterar\n";
               menu+= "4) Remover\n";
               menu+= "5) Sair";

        // Variável para sair do laço
        boolean continuar = true;
        
        // Laço
        do{

            // Obter a opção
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            // Escolha
            switch(opcao){
                case 1:
                
                    Carro c = new Carro();
                    c.modelo = JOptionPane.showInputDialog(null, "Informe o modelo do carro");
                    c.fabricante = JOptionPane.showInputDialog(null, "Informe o fabricante");
                    c.cor = JOptionPane.showInputDialog(null, "Informe a cor do carro");
                    c.ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano do carro"));
                    c.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));

                    dados.add(c);

                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                break;

                case 2:
                
                    // Lista de pessoas
                    String lista = "Carros cadastrados\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        lista += "\nModelo: " + dados.get(i).modelo;
                        lista += "\nFabricante: " + dados.get(i).fabricante;
                        lista += "\nCor: " + dados.get(i).cor;
                        lista += "\nAno: " + dados.get(i).ano;
                        lista += "\nValor: " + dados.get(i).valor;
                        lista += "\n-----------";
                    }

                    // Exbir lista
                    JOptionPane.showMessageDialog(null, lista);

                break;

                case 3:

                    // Lista os modelos de carros cadastrados
                    String modelos = "Selecione o modelo que deseja alterar \n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        modelos += (i+1) + ")" + dados.get(i).modelo + "\n";
                    }
                
                    // Obter o índice
                    int indice = Integer.parseInt(JOptionPane.showInputDialog(null, modelos));

                    Carro carro = new Carro();
                    carro.modelo = JOptionPane.showInputDialog(null, "Informe o modelo do carro");
                    carro.fabricante = JOptionPane.showInputDialog(null, "Informe o fabricante");
                    carro.cor = JOptionPane.showInputDialog(null, "Informe a cor do carro");
                    carro.ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano do carro"));
                    carro.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor"));

                    // Alterar
                    dados.set(indice-1, carro);

                    // Mensagem
                    JOptionPane.showMessageDialog(null, "Carro alterado com sucesso!");

                break;

                case 4:

                    // Lista os modelos de carros cadastrados
                    String modelosCarros = "Selecione o modelo\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        modelosCarros += (i+1) + ")" + dados.get(i).modelo + "\n";
                    }
                
                    // Obter o índice
                    int indiceCarro = Integer.parseInt(JOptionPane.showInputDialog(null, modelosCarros));

                    // Remove
                    dados.remove(indiceCarro-1);

                    // Mensagem
                    JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");

                break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Sair");
                    continuar = false;
                break;
            }

        }while(continuar == true);

    }

}
