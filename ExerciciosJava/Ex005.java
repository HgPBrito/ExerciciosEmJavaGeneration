package ExerciciosJava;

import java.util.Scanner;

public class Ex005 {

	/*Exercicio 005
	 * 
	 * Elaborar um programa que efetue a leitura sucessiva de 
	 * valores numéricos e apresente no final o total do somatório, 
	 * a média e o total de valores lidos. O programa deve fazer as 
	 * leituras dos valores enquanto o usuário estiver fornecendo 
	 * valores positivos. Ou seja, o programa deve parar quando o 
	 * usuário fornecer um valor negativo.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma, media, quantitativo, numero;
		numero = 0;
		soma = 0;
		quantitativo = 0;
		
		do {
			System.out.print("Digite um numero:");
			numero = sc.nextInt();
			if(numero >= 0) {
				soma += numero;
				quantitativo++;
			}			
		}while(numero >= 0);
		media = soma / quantitativo;
		
		System.out.println("Foram digitado(s): " + quantitativo + " números positivos.");
		System.out.println("A soma dos numeros foi: " + soma +".");
		System.out.println("A média dos numeros é: " + media +".");
	}
}
