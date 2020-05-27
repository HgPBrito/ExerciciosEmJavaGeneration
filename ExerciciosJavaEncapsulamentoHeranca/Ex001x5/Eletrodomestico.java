package Ex001x5;

public class Eletrodomestico {

	private String tipo;
	private String modelo;
	private String voltagem;
	private boolean led;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	public boolean isLed() {
		return led;
	}
	public void setLed(boolean led) {
		this.led = led;
	}
	
	public void ligar() {
		System.out.println("O "+ this.tipo + " esta ligado!");
	}
	
}
