package Lista01;

import javax.swing.JOptionPane;

public class Atividade11 {
    
    public static void main(String[] args) {

       // Obter os lados
       int ladoDireito = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o lado direito?"));
       int ladoEsquerdo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o lado esquerdo?"));
       int ladoInferior = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o lado inferior?"));

       // Criar a variável para conter o tipo de triângulo
       String triangulo = "";
   
       // Comparativo
       if(ladoDireito != ladoEsquerdo && ladoEsquerdo != ladoInferior){
           triangulo = "Escaleno";
       }else if(ladoDireito == ladoEsquerdo && ladoEsquerdo == ladoInferior){
           triangulo = "Equilátero";
       }else{
           triangulo = "Isósceles";
       }

       // Exibir mensagem
       JOptionPane.showMessageDialog(null, "O tipo do triângulo é: " + triangulo);

    }

}
