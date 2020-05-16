package ExerciciosJava;

import java.util.Scanner;

public class Ex006 {

	/*Exercicio 006
	 * 
	 * Uma empresa desenvolveu uma pesquisa para saber 
	 * as características psicológicas dos indivíduos 
	 * de uma região. Para tanto, a cada uma das pessoas 
	 * era perguntado: idade, sexo (1-feminino / 2-masculino), 
	 * e as opções (1, se a pessoa era calma; 2, se a 
	 * pessoa era nervosa e 3, se a pessoa era agressiva. 
	 * Pedese para elaborar um sistema que permita ler os 
	 * dados de 150 pessoas, calcule e mostre:
	 * • o número de pessoas calmas;
	 * • o número de mulheres nervosas;
	 * • o número de homens agressivos;
	 * • o número de pessoas nervosas com mais de 40 anos;
	 * • o número de pessoas calmas com menos de 18 anos.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		boolean condicao;
		int idade, sexo, qtdMasculinoAgressivo, qtdFemininoNervosas,
			status, qtdCalma, qtdCalmaMenorDezoito, qtdNervosaMaiorQuarenta, totalPessoas;
		
		totalPessoas = 10;
		
		qtdCalma = 0;
		qtdFemininoNervosas = 0;
		qtdMasculinoAgressivo = 0;
		qtdNervosaMaiorQuarenta = 0;		
		qtdCalmaMenorDezoito = 0;			
		
		for (int i = 0; i < totalPessoas; i++) {			
		
			System.out.println("_______________________________________");
			System.out.print("Digite a sua idade: ");
			idade = sc.nextInt();
			System.out.println("---------------------------------------");
			do {
				System.out.println("O seu sexo é...");
				System.out.println("1- Masculino");
				System.out.println("2- Feminino");	
				System.out.println();
				System.out.print("Digite o código do seu sexo: ");
				sexo = sc.nextInt();				
				if(sexo >= 1 && sexo <= 2) {
					condicao = true;
				} else {
					condicao = false;
					System.out.println("Código inválido! Digite novamente por favor.");
				}			
			} while (condicao == false);						
			System.out.println("---------------------------------------");
			do {
				System.out.println("Você se considera uma pessoa...");
				System.out.println("1- Calma");
				System.out.println("2- Nervosa");		
				System.out.println("3- Agressiva");
				System.out.println();
				System.out.print("Digite o código da sua consideração: ");
				status = sc.nextInt();
				if(status >= 1 && status <= 3) {
					condicao = true;
				} else {
					condicao = false;
					System.out.println("Código inválido! Digite novamente por favor.");
				}			
			} while (condicao == false);
			System.out.println("_______________________________________");			
			
			if(status == 1) {
				qtdCalma++;
			}
			if(sexo == 2 && status == 2) {
				qtdFemininoNervosas++;
			}
			if(sexo == 1 && status == 3) {
				qtdMasculinoAgressivo++;
			}
			if(idade > 40 && status == 2) {
				qtdNervosaMaiorQuarenta++;
			}
			if(idade < 18 && status == 1) {
				qtdCalmaMenorDezoito++;
			}		
		}
		System.out.println();
		System.out.println("_______________________________________");
		System.out.println("---------------------------------------");
		System.out.println("Total de Pessoas: " + totalPessoas);
		System.out.println();
		System.out.println("Pessoas calmas: " + qtdCalma);
		System.out.println();
		System.out.println("Mulheres nervosas: " + qtdFemininoNervosas);
		System.out.println();
		System.out.println("Homens agressivos: " + qtdMasculinoAgressivo);
		System.out.println();
		System.out.println("Pessoas nervosas com mais de 40 anos: " + qtdNervosaMaiorQuarenta);
		System.out.println();
		System.out.println("Pessoas calmas com menos de 18 anos: " + qtdCalmaMenorDezoito);
		System.out.println("---------------------------------------");
		System.out.println("_______________________________________");
		
		
		
		
	}
}
