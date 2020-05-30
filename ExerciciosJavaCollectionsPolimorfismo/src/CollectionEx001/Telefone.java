package CollectionEx001;

public class Telefone {

	private String nrTelefone;
	private int tipoTelefone;
	
	public Telefone (int tipoTelefone, String nrTelefone) {
		this.tipoTelefone = tipoTelefone;
		this.nrTelefone = nrTelefone;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public String getTipoTelefone() {
		switch (this.tipoTelefone) {
		case 0:
			return "residencial";
		case 1:
			return "comercial";
		case 2:
			return "celular";
		default:
			return "Erro inesperado.";
		}
	}	
}
