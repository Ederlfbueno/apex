package Generics;

public class Principal {
	
	public static void main(String[] args) {
		Integer[] idades = {1,2,3,4,5}; 
		Double[] alturas = {1.5,2.5,3.5,.45};
		String[] nomes = {"Joao","Hans","pati","gabriel"};
		
		
		exibir(alturas);
		exibir(nomes);
		exibir(idades);
	}
	
	public static <E> void exibir(E[] parametroArray) {
		for(E elemento : parametroArray) {
			System.out.println(elemento);
		}
	}
}
