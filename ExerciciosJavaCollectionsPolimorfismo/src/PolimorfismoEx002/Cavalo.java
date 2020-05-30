package PolimorfismoEx002;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);		
	}

	@Override
	public String emiteSom() {		
		return "Relincha";
	}

	@Override
	public String executaAcao() {		
		return "Corre";
	}

}
