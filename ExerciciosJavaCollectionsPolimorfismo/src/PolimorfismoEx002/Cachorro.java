package PolimorfismoEx002;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);		
	}

	@Override
	public String emiteSom() {
		
		return "Late";
	}

	@Override
	public String executaAcao() {
		
		return "Corre";
	}

}
