package AtividadesArrayList.atividade07;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
       
        // ArrayList
        ArrayList<Contato> dados = new ArrayList<Contato>();

        // Menu
        String menu = "O que deseja fazer?\n";
               menu+= "1) Cadastrar\n";
               menu+= "2) Listar\n";
               menu+= "3) Alterar\n";
               menu+= "4) Remover\n";
               menu+= "5) Filtrar\n";
               menu+= "6) Sair";

        // Variável para sair do laço
        boolean continuar = true;
        
        // Laço
        do{

            // Obter a opção
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            // Escolha
            switch(opcao){
                case 1:
                
                    Contato c = new Contato();
                    c.nome = JOptionPane.showInputDialog(null, "Informe o nome do contato");
                    c.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade"));
                    c.email = JOptionPane.showInputDialog(null, "Informe o e-mail");
                    c.estado = JOptionPane.showInputDialog(null, "Informe o estado");
                    c.cidade = JOptionPane.showInputDialog(null, "Informe a cidade");
                    c.bairro = JOptionPane.showInputDialog(null, "Informe o barro");
                    c.rua = JOptionPane.showInputDialog(null, "Informe a rua");
                    c.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do endereço"));
                    c.complemento = JOptionPane.showInputDialog(null, "Informe o complemento");
                    c.telefone = JOptionPane.showInputDialog(null, "Informe o telefone");

                    dados.add(c);

                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                break;

                case 2:
                
                    // Lista de pessoas
                    String lista = "Contatos cadastrados\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        lista += "\nNome: " + dados.get(i).nome;
                        lista += "\nIdade: " + dados.get(i).idade;
                        lista += "\nE-mail: " + dados.get(i).email;
                        lista += "\nEstado: " + dados.get(i).estado;
                        lista += "\nCidade: " + dados.get(i).cidade;
                        lista += "\nBairro: " + dados.get(i).bairro;
                        lista += "\nRua: " + dados.get(i).rua;
                        lista += "\nNúmero: " + dados.get(i).numero;
                        lista += "\nComplemento: " + dados.get(i).complemento;
                        lista += "\n-----------";
                    }

                    // Exbir lista
                    JOptionPane.showMessageDialog(null, lista);

                break;

                case 3:

                    // Lista os modelos de contatos cadastrados
                    String modelos = "Selecione o modelo que deseja alterar \n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        modelos += (i+1) + ")" + dados.get(i).nome + "\n";
                    }
                
                    // Obter o índice
                    int indice = Integer.parseInt(JOptionPane.showInputDialog(null, modelos));

                    Contato contato = new Contato();
                    contato.nome = JOptionPane.showInputDialog(null, "Informe o nome do contato");
                    contato.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade"));
                    contato.email = JOptionPane.showInputDialog(null, "Informe o e-mail");
                    contato.estado = JOptionPane.showInputDialog(null, "Informe o estado");
                    contato.cidade = JOptionPane.showInputDialog(null, "Informe a cidade");
                    contato.bairro = JOptionPane.showInputDialog(null, "Informe o barro");
                    contato.rua = JOptionPane.showInputDialog(null, "Informe a rua");
                    contato.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do endereço"));
                    contato.complemento = JOptionPane.showInputDialog(null, "Informe o complemento");
                    contato.telefone = JOptionPane.showInputDialog(null, "Informe o telefone");

                    // Alterar
                    dados.set(indice-1, contato);

                    // Mensagem
                    JOptionPane.showMessageDialog(null, "Contato alterado com sucesso!");

                break;

                case 4:

                    // Lista os clientes cadastrados
                    String nomeContatos = "Selecione o contato\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        nomeContatos += (i+1) + ")" + dados.get(i).nome + "\n";
                    }
                
                    // Obter o índice
                    int indiceContato= Integer.parseInt(JOptionPane.showInputDialog(null, nomeContatos));

                    // Remove
                    dados.remove(indiceContato-1);

                    // Mensagem
                    JOptionPane.showMessageDialog(null, "Contato removido com sucesso!");

                break;

                case 5:

                    // Obter termo da pesquisa
                    String termo = JOptionPane.showInputDialog(null, "Informe o termo pesquisado através do nome (Letras maísuculas e minúsculas diferem)");

                    // Resultado da filtragem
                    String resultadoFiltragem = "";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        // Condicional
                        if(dados.get(i).nome.indexOf(termo) != -1){
                            resultadoFiltragem += "\nNome: " + dados.get(i).nome;
                            resultadoFiltragem += "\nIdade: " + dados.get(i).idade;
                            resultadoFiltragem += "\nE-mail: " + dados.get(i).email;
                            resultadoFiltragem += "\nEstado: " + dados.get(i).estado;
                            resultadoFiltragem += "\nCidade: " + dados.get(i).cidade;
                            resultadoFiltragem += "\nBairro: " + dados.get(i).bairro;
                            resultadoFiltragem += "\nRua: " + dados.get(i).rua;
                            resultadoFiltragem += "\nNúmero: " + dados.get(i).numero;
                            resultadoFiltragem += "\nComplemento: " + dados.get(i).complemento;
                            resultadoFiltragem += "\n-----------";
                        }
                    }

                    // Mensagem
                    JOptionPane.showMessageDialog(null, resultadoFiltragem);

                break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Sair");
                    continuar = false;
                break;
            }

        }while(continuar == true);

    }

}