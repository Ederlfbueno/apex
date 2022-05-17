package Lista02;

public class Atividade03 {
    
    public static void main(String[] args) {
        
        // Número
        int numero = 5;

        // Resultado
        int resultado = 0;

        // Laço
        for(int i=numero-1; i>0; i--){
            if(i == numero-1){
                resultado = numero * i;
                System.out.println(numero+ " X "+i+" = "+resultado);
            }else{
                System.out.println(resultado+ " X "+i+" = "+(resultado*i));
                resultado = resultado * i;
            }
        }

    }

}
