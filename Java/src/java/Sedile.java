package java;

public class Sedile {


	private String tipo;
	private String posizione;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	public void alza() {
		this.posizione="Alzato";
	}
	
	public void abbassa() {
		this.posizione="Abbassato";
	}
	
	public Sedile(String tipo) {
		this.tipo = tipo;
		this.posizione = "Alzato";
	}

}
