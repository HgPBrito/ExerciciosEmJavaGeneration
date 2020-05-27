package Ex003;

public class Veiculo {

	private String marca;
	private String cor;
	private int ano;
	private int qtdRoda;
	private int km = 0;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getQtdRoda() {
		return qtdRoda;
	}

	public void setQtdRoda(int qtdRoda) {
		this.qtdRoda = qtdRoda;
	}

	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	public void acelerar(int km) {
		if (km > 0) {
			this.km += km;
			System.out.println("O veiculo de " + this.qtdRoda + " rodas esta acelerando a " + this.km + "km/h!");
		} else {
			System.out.println("tente freiar!");
		}
	}

	public void fazerCurva() {
		System.out.println("O veiculo de " + this.qtdRoda + " rodas esta fazendo uma curva a " + this.km + "km/h!");
	}

	public void freiar(int km) {
		if (km > 0 && km <= this.km) {
			this.km -= km;
			System.out.println("O veiculo de " + this.qtdRoda + " rodas esta freiando mas ainda esta a " + this.km + "km/h!");
		} else {			
			System.out.println("O freio falhou? já esta parado? esta \"indo\" a " + this.km + "km/h!");
		}
	}

}