package Ex002;

public class main {

	/*2) Crie um sistema utilizando herança e encapsulado 
	 * representando veículos. 
	 * O sistema deve ter 4 camadas uma de veículo, outra 
	 * de carro, outra de moto outra da classe principal (main). 
	 * Os métodos dos veículos devem ser acessados na classe 
	 * principal (Main) apenas por get and seters. 
	 * As classes deverão possuir heranças de seus atributos e métodos.
	 */
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setAno(2015);
		carro.setCor("Cinza");
		carro.setMarca("Renaut");
		carro.setQtdRoda(4);
		
		carro.setArCondicionado(true);
		carro.setCdPlayer(false);
		carro.setConversivel(false);
		carro.setDirecaoHidraulica(true);
		
		carro.acelerar();
		carro.freiar();
		carro.escutarMusica();
		
		
		
		Moto moto = new Moto();
		moto.setAno(2013);
		moto.setCor("Preta");
		moto.setMarca("Harley");
		moto.setQtdRoda(3);
		
		moto.setBandeira(true);
		moto.setPortaTreco(true);
		moto.setPorte("Grande");
		
		moto.acelerar();
		moto.freiar();
		moto.passarCorredor();
	}
}
