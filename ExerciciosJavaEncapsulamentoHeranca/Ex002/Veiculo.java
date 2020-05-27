package Ex002;

public class Veiculo {

	private String marca;
	private String cor;
	private int ano;
	private int qtdRoda;
	
	
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
	
	public void acelerar() {
		System.out.println("O veiculo de " + this.qtdRoda + " rodas esta acelerando!");
	}
	
	public void freiar() {
		System.out.println("O veiculo de " + this.qtdRoda + " rodas esta freiando!");
	}	
	
}