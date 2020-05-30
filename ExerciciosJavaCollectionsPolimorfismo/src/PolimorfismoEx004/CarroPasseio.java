package PolimorfismoEx004;

public class CarroPasseio extends Veiculo{

	private String cor;
	private String modelo;
	
	public void entrPass(double peso, int velMax, double preco, String cor, String modelo) {
		super.entrVeic(peso, velMax, preco);
		this.cor = cor;
		this.modelo = modelo;		
	}

	public String mostPass() {
		return (super.mostVeic() +", "+ this.cor +", "+ this.modelo);
	}
}


