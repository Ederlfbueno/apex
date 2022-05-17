package Lista03;

import javax.swing.*;

public class Atividade02 {
    
    public static void main(String[] args) {
        
        // Vetor
        String[] clientes = new String[10];

        // Contador
        int contador = 0;

        // Laço
        do{
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente");

            // Verifica se o nome do cliente informado já existe
            boolean existe = false;
            for(int i = 0; i<clientes.length; i++){
                if(clientes[i].equals(nome)){
                    existe = true;
                }
            }

            // Condicional
            if(existe == true){
                JOptionPane.showMessageDialog(null, "Ops... Esse cliente já existe, o cadastro não foi efetuado");
            }else{
                clientes[contador] = nome;
            }

            // Verifica se deseja continuar
            int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

            // Incremento do contador
            if(continuar == 0){
                contador++;
            }else{
                contador = 10;
            }
        }while(contador < 10);

        // Listar clientes
        String mensagem = "Clientes cadastrados:\n";
        for(int i=0; i<clientes.length; i++){
            if(clientes[i] != null){
                mensagem += clientes[i] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, mensagem);

    }

}
