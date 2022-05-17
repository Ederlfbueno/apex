package AtividadesArrayList.atividade06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
       
        // ArrayList
        ArrayList<Cliente> dados = new ArrayList<Cliente>();

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
                
                    Cliente c = new Cliente();
                    c.nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente");
                    c.email = JOptionPane.showInputDialog(null, "Informe o e-mail");
                    c.estado = JOptionPane.showInputDialog(null, "Informe o estado");
                    c.cidade = JOptionPane.showInputDialog(null, "Informe a cidade");
                    c.profissao = JOptionPane.showInputDialog(null, "Informe a profissão");
                    c.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade"));

                    dados.add(c);

                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                break;

                case 2:
                
                    // Lista de pessoas
                    String lista = "Clientes cadastrados\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        lista += "\nModelo: " + dados.get(i).nome;
                        lista += "\nE-mail: " + dados.get(i).email;
                        lista += "\nEstado: " + dados.get(i).estado;
                        lista += "\nCidade: " + dados.get(i).cidade;
                        lista += "\nProfissão: " + dados.get(i).profissao;
                        lista += "\nIdade: " + dados.get(i).idade;
                        lista += "\n-----------";
                    }

                    // Exbir lista
                    JOptionPane.showMessageDialog(null, lista);

                break;

                case 3:

                    // Lista os modelos de clientes cadastrados
                    String modelos = "Selecione o modelo que deseja alterar \n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        modelos += (i+1) + ")" + dados.get(i).nome + "\n";
                    }
                
                    // Obter o índice
                    int indice = Integer.parseInt(JOptionPane.showInputDialog(null, modelos));

                    Cliente cliente = new Cliente();
                    cliente.nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente");
                    cliente.email = JOptionPane.showInputDialog(null, "Informe o e-mail");
                    cliente.estado = JOptionPane.showInputDialog(null, "Informe o estado");
                    cliente.cidade = JOptionPane.showInputDialog(null, "Informe a cidade");
                    cliente.profissao = JOptionPane.showInputDialog(null, "Informe a profissão");
                    cliente.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade"));

                    // Alterar
                    dados.set(indice-1, cliente);

                    // Mensagem
                    JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");

                break;

                case 4:

                    // Lista os clientes cadastrados
                    String nomeClientes = "Selecione o cliente\n";

                    // Laço
                    for(int i=0; i<dados.size(); i++){
                        nomeClientes += (i+1) + ")" + dados.get(i).nome + "\n";
                    }
                
                    // Obter o índice
                    int indiceCliente = Integer.parseInt(JOptionPane.showInputDialog(null, nomeClientes));

                    // Remove
                    dados.remove(indiceCliente-1);

                    // Mensagem
                    JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");

                break;

                case 5:

                    // Obter o tipo de se filtragem que deseja ser feito
                    int opcaoFiltragem = Integer.parseInt(JOptionPane.showInputDialog(null, "1)Nome \n2)Estado \n3)Cidade"));

                    // Obter termo da pesquisa
                    String termo = JOptionPane.showInputDialog(null, "Informe o termo pesquisado (Letras maísuculas e minúsculas diferem)");

                    // Resultado da filtragem
                    String resultadoFiltragem = "";

                    // Escolha
                    switch(opcaoFiltragem){
                        case 1:
                            // Laço
                            for(int i=0; i<dados.size(); i++){
                                // Condicional
                                if(dados.get(i).nome.indexOf(termo) != -1){
                                    resultadoFiltragem += "Nome: " + dados.get(i).nome + "\n";
                                    resultadoFiltragem += "E-mail: " + dados.get(i).email + "\n";
                                    resultadoFiltragem += "Estado: " + dados.get(i).estado + "\n";
                                    resultadoFiltragem += "Cidade: " + dados.get(i).cidade + "\n";
                                    resultadoFiltragem += "Profissão: " + dados.get(i).profissao + "\n";
                                    resultadoFiltragem += "Idade: " + dados.get(i).idade + "\n";
                                    resultadoFiltragem += "--------------------------\n";
                                }
                            }
                        break;

                        case 2:
                            // Laço
                            for(int i=0; i<dados.size(); i++){
                                // Condicional
                                if(dados.get(i).estado.indexOf(termo) != -1){
                                    resultadoFiltragem += "Nome: " + dados.get(i).nome + "\n";
                                    resultadoFiltragem += "E-mail: " + dados.get(i).email + "\n";
                                    resultadoFiltragem += "Estado: " + dados.get(i).estado + "\n";
                                    resultadoFiltragem += "Cidade: " + dados.get(i).cidade + "\n";
                                    resultadoFiltragem += "Profissão: " + dados.get(i).profissao + "\n";
                                    resultadoFiltragem += "Idade: " + dados.get(i).idade + "\n";
                                    resultadoFiltragem += "--------------------------\n";
                                }
                            }
                        break;

                        case 3:
                            // Laço
                            for(int i=0; i<dados.size(); i++){
                                // Condicional
                                if(dados.get(i).cidade.indexOf(termo) != -1){
                                    resultadoFiltragem += "Nome: " + dados.get(i).nome + "\n";
                                    resultadoFiltragem += "E-mail: " + dados.get(i).email + "\n";
                                    resultadoFiltragem += "Estado: " + dados.get(i).estado + "\n";
                                    resultadoFiltragem += "Cidade: " + dados.get(i).cidade + "\n";
                                    resultadoFiltragem += "Profissão: " + dados.get(i).profissao + "\n";
                                    resultadoFiltragem += "Idade: " + dados.get(i).idade + "\n";
                                    resultadoFiltragem += "--------------------------\n";
                                }
                            }
                        break;
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