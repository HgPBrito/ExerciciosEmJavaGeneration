package ExerciciosJava;

public class Ex001 {

	/*Exercicio 001
	 * 
	 * Desenvolver um sistema que efetue a soma de todos os 
	 * números ímpares que são múltiplos de três e que se 
	 * encontram no conjunto dos números de 1 até 500.
	 * 
	 */
	
	public static void main(String[] args) {
		
		final int inicio, fim;		
		int soma;
		
		inicio = 1;
		fim = 500;
		soma = 0;
		
		for(int i = inicio; i <= fim; i++) {
			
			if(i % 2 != 0 && i % 3 == 0) {
				soma += i;								
			}
			
		}
		System.out.println(soma);
	}
}
