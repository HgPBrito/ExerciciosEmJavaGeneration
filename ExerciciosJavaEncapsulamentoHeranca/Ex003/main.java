package Ex003;

public class main {

	/*3) Implemente o método acelerar e freio (reduzir) 
	 * de forma dinâmica trabalhando com os de velocidade das classes.
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
		
		carro.acelerar(10);
		carro.freiar(5);
		carro.escutarMusica();
		
		carro.fazerCurva();
		
		
		
		Moto moto = new Moto();
		moto.setAno(2013);
		moto.setCor("Preta");
		moto.setMarca("Harley");
		moto.setQtdRoda(3);
		
		moto.setBandeira(true);
		moto.setPortaTreco(true);
		moto.setPorte("Grande");
		
		moto.acelerar(50);
		moto.freiar(30);
		moto.passarCorredor();
		
		carro.fazerCurva();
	}
}
