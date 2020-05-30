package PolimorfismoEx004;

public class Caminhao extends Veiculo{

	private double toneladas;
	private int altMax;
	private int comprimento;

	public void entrCam(double peso, int velMax, double preco, double toneladas, int altMax, int comprimento) {
		super.entrVeic(peso, velMax, preco);
		this.toneladas = toneladas;
		this.altMax = altMax;
		this.comprimento = comprimento;
	}

	public String mostCam() {
		return (super.mostVeic() +", "+ this.toneladas +", "+ this.altMax +", "+ this.comprimento);
	}
}
