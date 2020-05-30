package PolimorfismoEx003;

public abstract class Animal {

	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public abstract String emiteSom();
	public abstract String executaAcao();
}
