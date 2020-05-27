package Desafio;

public class Veiculo {

	private String marca;
	private String cor;
	private int ano;
	private int qtdRoda;
	private int km = 0;
	private boolean capotado = false;

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
		if(capotado == true) {
			System.out.println("O veiculo de " + this.qtdRoda + " rodas esta acelerando mas não sai do lugar....");
		}else if (km > 0) {
			this.km += km;
			System.out.println("O veiculo de " + this.qtdRoda + " rodas esta acelerando a " + this.km + "km/h!");
		} else {
			System.out.println("tente freiar!");
		}
	}

	public void fazerCurva() { 
		if(this.km < 70) {	
			System.out.println("O veiculo de " + this.qtdRoda + " rodas esta fazendo uma curva a " + this.km + "km/h!");
		} else {
			this.capotado = true;
			System.out.println("Ao virar o volante, você percebe que está a " + this.km + "km/h! sem tempo de reação seu carro capota varias e varias vezes até parar no acostamento...");
		}
	}

	public void freiar(int km) {
		if(capotado == true) {
			System.out.println("O veiculo de " + this.qtdRoda + " rodas esta freiando mas as rodas estão pra cima....");
		}else if (km > 0 && km <= this.km) {
			this.km -= km;
			System.out.println("O veiculo de " + this.qtdRoda + " rodas esta freiando mas ainda esta a " + this.km + "km/h!");
		} else {			
			System.out.println("O freio falhou? já esta parado? esta \"indo\" a " + this.km + "km/h!");
		}
	}
}



