package OrientacaoAobjetos.construtor;

import javax.swing.JOptionPane;

public class Pessoa {
    
    // Construtor
    public Pessoa(){
        JOptionPane.showMessageDialog(null, "Hello World");
    }

    public Pessoa(String nome){
        JOptionPane.showMessageDialog(null, "Olá "+nome);
    }

    public Pessoa(String nome, int idade){
        JOptionPane.showMessageDialog(null, "Olá "+nome+" você tem "+idade+" anos");
    }



}
