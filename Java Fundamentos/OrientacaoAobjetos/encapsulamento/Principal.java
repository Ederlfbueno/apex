package OrientacaoAobjetos.encapsulamento;

public class Principal {
    
    public static void main(String[] args) {
        
        Pessoa objeto = new Pessoa();
        objeto.setNome("Ralf");
        objeto.setIdade(31);

        System.out.println(objeto.getNome());
        System.out.println(objeto.getIdade());

    }

}
