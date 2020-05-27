package Ex002;

public class Carro extends Veiculo{
	
	private boolean cdPlayer;
	private boolean arCondicionado;
	private boolean direcaoHidraulica;
	private boolean conversivel;	
	
	public boolean isCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(boolean cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public boolean isConversivel() {
		return conversivel;
	}

	public void setConversivel(boolean conversivel) {
		this.conversivel = conversivel;
	}

	public void escutarMusica() {
		if (this.cdPlayer == true) {
			System.out.println("Tocando musica preferida!");
		} else {
			System.out.println("Compre pelomenos um toca fita!");
		}
	}

}
