package Lista01;

import javax.swing.JOptionPane;

public class Atividade07 {
 
    public static void main(String[] args) {
        
        // Obter o dia
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe uma data do mês de setembro"));

        // Mensagem
        String mensagem = "";

        // Valida se o dia está entre 1 e 30, caso contrário, retorna o dia da semana
        if(dia < 1 || dia > 30){
            mensagem = "Data inválida";
        }else if(dia == 6 || dia == 13 || dia == 20 || dia == 27){
            mensagem = "Segunda-feira";
        }else if(dia == 7 || dia == 14 || dia == 21 || dia == 28){
            mensagem = "Terça-feira";
        }else if(dia == 1 || dia == 8 || dia == 15 || dia == 22 || dia == 29){
            mensagem = "Quarta-feira";
        }else if(dia == 2 || dia == 9 || dia == 16 || dia == 23 || dia == 30){
            mensagem = "Quinta-feira";
        }else if(dia == 3 || dia == 10 || dia == 17 || dia == 24){
            mensagem = "Sexta-feira";
        }else if(dia == 4 || dia == 11 || dia == 18 || dia == 25){
            mensagem = "Sábado";
        }else{
            mensagem = "Domingo";
        }

        // Exibir dia da semana
        JOptionPane.showMessageDialog(null, mensagem);

    }
    
}
