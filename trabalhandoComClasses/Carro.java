package trabalhandoComClasses;

public class Carro {

//atributos
	private String cor;
	private String marca;
	
//metodo construtor	- tem sempre o nome da classe
	public Carro(String cor, String marca) {
		this.cor = cor;
		this.marca = marca;
	}
	
 //metodos getters e setters

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
//metodos especificos
	
	public void mostraCor(){
		System.out.println("A cor do carro é " + getCor());
	}
	
	public void mostraMarca(){
		System.out.println("A marca do carro é " + getMarca());
	}
	
	public void mostraMarcaCor(){
		System.out.println("A marca do carro é: " + getMarca() + 
				" e a cor é: " + getCor());
	}
	
}
