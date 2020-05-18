package trabalhandoComClasses;

import java.util.Scanner;

public class UtilizandoClasseComDigitacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		Carro carro = new Carro("","");
		
		System.out.print("Informe a cor por favor: ");
		carro.setCor(sc.nextLine());
		
		System.out.print("Informe a marca por favor: ");
		carro.setMarca(sc.nextLine());
		
		carro.mostraMarcaCor();
	}
}
