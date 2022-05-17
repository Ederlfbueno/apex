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

    // Métodos
    public void valeTransporte(){
        System.out.println("Vale Transporte Padr�o R$"+(salario*0.06));
    }

    public void impostoRenda(){
        System.out.println("Imposto de Renda Padr�o R$"+(salario*0.10));
    }
    
}