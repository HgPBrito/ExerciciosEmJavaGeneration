package ExerciciosJava;

import java.util.Scanner;

public class Ex007 {

	/*Exercicio 007
	 * 
	 * Escrever um sistema que lê um valor N inteiro e positivo 
	 * e que calcula e escreve o valor de E.
	 * E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, e, f;
		boolean condicao;
		
		e = 0;
		f = 1;
		
		
		do {
			System.out.print("Digite um valor inteiro e positivo:");			
			numero = sc.nextInt();				
			if(numero > 0) {
				condicao = true;
			} else {
				condicao = false;
				System.out.println("Número inválido! Digite novamente por favor.");
			}			
		} while (condicao == false);
		
		for (int i = 1; i <= numero; i++) {			
			f *= (i + 1);   		
			e += i + i/f;
		}
		System.out.println("O valor de E: " + e);
		
	}
}
