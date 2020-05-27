package Ex001;

public class Aeronave {
	
	private String tipo;
	private String modelo;
	private boolean helice;
	private boolean turbina;
	private int passageiroSuportado;
	
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
	public boolean isHelice() {
		return helice;
	}
	public void setHelice(boolean helice) {
		this.helice = helice;
	}
	public boolean isTurbina() {
		return turbina;
	}
	public void setTurbina(boolean turbina) {
		this.turbina = turbina;
	}
	public int getPassageiroSuportado() {
		return passageiroSuportado;
	}
	public void setPassageiroSuportado(int passageiroSuportado) {
		this.passageiroSuportado = passageiroSuportado;
	}
	
	public void voar() {
		System.out.println("O " + this.tipo + " está voando!");
	}

}
