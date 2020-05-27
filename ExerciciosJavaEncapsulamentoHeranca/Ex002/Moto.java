package Ex002;

public class Moto extends Veiculo{
	
	private String porte;
	private boolean bandeira;
	private boolean portaTreco;	
	
	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public boolean isBandeira() {
		return bandeira;
	}

	public void setBandeira(boolean bandeira) {
		this.bandeira = bandeira;
	}

	public boolean isPortaTreco() {
		return portaTreco;
	}

	public void setPortaTreco(boolean portaTreco) {
		this.portaTreco = portaTreco;
	}

	public void passarCorredor() {
		super.acelerar();
		System.out.println("Passando pelo corredor arrancando retrovisores!");
	}

}
