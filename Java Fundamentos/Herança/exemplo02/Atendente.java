package Heran�a.exemplo02;

import javax.swing.JOptionPane;

public class Atendente extends Colaborador{

     // Construtor
     public Atendente(){
        JOptionPane.showMessageDialog(null, "O valor do Imposto de Renda será de R$ " + ir());
        JOptionPane.showMessageDialog(null, "Seu prêmio faltas será de R$ " + premioFaltas());

        double salarioLiquido = (salario + premioFaltas()) - ir();

        JOptionPane.showMessageDialog(null, "O salário líquido será de R$ " + salarioLiquido);
    }

    // Imposto de Renda
    private double ir(){
        double valor = 0;

        if(salario <= 1000){
            valor = salario * 0.03;
        }else if(salario <= 2500){
            valor = salario * 0.05;
        }else{
            valor = salario * 0.07;
        }

        return valor;
    }

    // Prêmio faltas
    private double premioFaltas(){
        return faltas == 0 ? 50 : 0;
    }

    
}
