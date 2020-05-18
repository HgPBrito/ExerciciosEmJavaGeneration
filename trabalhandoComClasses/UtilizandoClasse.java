package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		
		String cor, marca;
		cor = "Preto";
		marca = "Renaut";
		
		Carro carro = new Carro(cor, marca);
		
		carro.mostraMarca();
		carro.mostraCor();
		carro.mostraMarcaCor();
		
		carro.setCor("Branco");
		carro.mostraCor();
		
		marca = "Fiat";		
		carro.mostraMarca();
		
		carro.setMarca(marca);
		carro.mostraMarca();
	}
}