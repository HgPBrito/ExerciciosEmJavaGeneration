package Ex001;

public class main {

	/*1) Crie um sistema encapsulado representando aeronaves. 
	 * O sistema deve ter duas camadas uma de aeronave e outra 
	 * classe principal (Main). 
	 * Os métodos da aeronave devem ser acessados na classe 
	 * principal (Main) apenas por getters and setters. 
	 */
	
	public static void main(String[] args) {
		
		Aeronave aeronave = new Aeronave();
		
		aeronave.setHelice(true);
		aeronave.setModelo("ATK-123");
		aeronave.setPassageiroSuportado(5);
		aeronave.setTipo("Jato Particular");
		aeronave.setTurbina(true);
		
		aeronave.voar();
	}
}
