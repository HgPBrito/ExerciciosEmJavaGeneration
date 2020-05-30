package PolimorfismoEx004;

public abstract class Veiculo {

	private double peso;
	private int velMax;
	private double preco;

	public void entrVeic(double peso, int velMax, double preco) {
		this.peso = peso;
		this.peso = velMax;
		this.preco = preco;
	}

	public String mostVeic() {
		return (this.peso +", "+ this.peso +", "+ this.preco);
	}
}
