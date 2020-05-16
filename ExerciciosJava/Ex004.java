package ExerciciosJava;

import java.util.Scanner;

public class Ex004 {

	/*Exercicio 004
	 * 
	 * Ler o nome de um aluno e as suas duas notas A e B, e após
	 * calcular a média ponderada entre estas notas (A tem peso 1 
	 * e B tem peso 2). Verifique se a nota digitada é valida, 
	 * caso seja inválida, repita a leitura. Repetir este procedimento 
	 * para uma turma composta por cinco alunos, usando o comando While.
	 * 
	 * Exemplo de tela de saída:
	 * Entre com o nome do aluno: Fulano da Silva
	 * Entre com o grau A: 5.0
	 * Entre com o grau B: 6.0
	 * O aluno Fulano da Silva tem uma media: 5.66
	 * Entre com o nome do aluno: Ciclano da Silva
	 * Entre com o grau A: 12.5
	 * Nota invalida!
	 * Entre com o grau A: 2.5
	 * ...
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nomeAlunx;
		double notaA, notaB, media;
		int totalAlunos;
		boolean condicao;
		
		totalAlunos = 5;
		
		for (int i = 0; i < totalAlunos; i++) {		
		
			System.out.print("Entre com o nome dx alunx: ");
			nomeAlunx = sc.nextLine();
			
			do {		
				System.out.print("Entre com o grau A: ");
				notaA = sc.nextDouble();
				if(notaA > 0.0 && notaA <= 10.0) {
					condicao = true;
				} else {
					condicao = false;
					System.out.println("Nota inválida! Digite novamente por favor.");
				}			
			} while (condicao == false);
			
			do {
				System.out.print("Entre com o grau B: ");
				notaB = sc.nextDouble();
				if(notaB > 0.0 && notaB <= 10.0) {
					condicao = true;
				} else {
					condicao = false;
					System.out.println("Nota inválida! Digite novamente por favor.");
				}			
			} while (condicao == false);
			
			media = (notaA*1 + notaB*2)/3;
			
			System.out.println("X alunx " + nomeAlunx + " tem uma media: " + media);
			System.out.println();
		
		}
		
	}
}
