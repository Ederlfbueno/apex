package Polimorfismo;

/**
 * Padrao
 */
public class Padrao {

    // Atributo
    double salario;

    // Construtor
    public Padrao(double salario){
        this.salario = salario;
        valeTransporte();
        impostoRenda();
    }

    // MÃ©todos
    public void valeTransporte(){
        System.out.println("Vale Transporte Padrão R$"+(salario*0.06));
    }

    public void impostoRenda(){
        System.out.println("Imposto de Renda Padrão R$"+(salario*0.10));
    }
    
}