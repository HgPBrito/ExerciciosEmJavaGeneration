package Ex001x5;

public class main {

	/*1.5) Crie um sistema encapsulado representando eletrodomésticos.
	 *  O sistema deve ter duas camadas uma de eletrodomésticos e outra 
	 *  classe principal (Main). 
	 *  Os métodos da eletrodomésticos devem ser acessados na classe 
	 *  principal (Main) apenas por getters and setters.
	 */
	
	public static void main(String[] args) {
		
		Eletrodomestico eletro = new Eletrodomestico();
		
		eletro.setLed(true);
		eletro.setModelo("AN-2018");
		eletro.setTipo("Microondas");
		eletro.setVoltagem("bivolt");
		eletro.ligar();
	}
}
