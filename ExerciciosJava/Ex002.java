package ExerciciosJava;

public class Ex002 {

	/*Exercicio 002
	 * 
	 * Escreva um sistema estruturado que gere
	 * os números de 1000 a 1999 e escreva somente 
	 * os números que são divisíveis por 11 e cujo resto é 5.
	 * 
	 */
	
	public static void main(String[] args) {
		
		final int inicio, fim;			
		
		inicio = 1000;
		fim = 1999;
		
		
		for(int i = inicio; i <= fim; i++) {
			
			if(i % 11 == 5) {
				System.out.println(i);
			}
			
		}
		
	}
}
