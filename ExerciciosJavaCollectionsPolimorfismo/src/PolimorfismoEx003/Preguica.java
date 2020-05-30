package PolimorfismoEx003;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);		
	}

	@Override
	public String emiteSom() {		
		return "Gruni";
	}

	@Override
	public String executaAcao() {		
		return "Subir em árvore";
	}

}
