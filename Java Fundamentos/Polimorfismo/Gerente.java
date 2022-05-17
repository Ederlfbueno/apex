package Polimorfismo;

public class Gerente extends Padrao{
    
    // Construtor
    public Gerente(double salario){
        super(salario);
    }

    // Método
    public void impostoRenda(){
        System.out.println("Imposto de Renda Gerente: "+(salario*0.20));
    }
    
}
