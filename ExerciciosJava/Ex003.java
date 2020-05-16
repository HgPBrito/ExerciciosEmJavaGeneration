package ExerciciosJava;

public class Ex003 {

	/*Exercicio 003
	 * 
	 * Faça um programa que mostre uma contagem na tela de 233 a 456, 
	 * só que contando de 3 em 3 quando estiver entre 300 e 400 e 
	 * de 5 em 5 quando não estiver.
	 * 
	 */
	
	public static void main(String[] args) {
		
		final int inicio, fim;			
		
		inicio = 233;
		fim = 456;
		
		
		for(int i = inicio; i <= fim; i += 5) {
			
			System.out.println(i);
			
			if(i > 300 && i < 400) {
				i -= 2;
			}
			
		}
	}
}
