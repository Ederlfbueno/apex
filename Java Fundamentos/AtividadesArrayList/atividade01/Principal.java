package AtividadesArrayList.atividade01;

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        
        // Vetor
        ArrayList<Pessoa> dados = new ArrayList<Pessoa>();
        // laco 
        // Instanciar objetos
        Pessoa p1 = new Pessoa();
        p1.nome = "Alice";
        p1.cidade = "Blumenau";
        p1.idade = 19;

        // Adicionar objetos no vetor
        dados.add(p1);
        // fim laco 
        
        
        // chama funcao exibir dados
        
        
    }
    
    private void exibirDados(ArrayList<Pessoa> dados) {
        for(int i=0; i<dados.size(); i++){
            System.out.println(dados.get(codigo).nome);
            System.out.println(dados.get(i).cidade);
            System.out.println(dados.get(i).idade);
            System.out.println("-------------------");
        }
    }

}


