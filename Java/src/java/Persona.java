package java;

public class Persona {

	private String nome;
	private String cognome;
	public int eta;
	

	protected String getNome() {
		return nome;
	}


	protected void setNome(String nome) {
		this.nome = nome;
	}


	protected String getCognome() {
		return cognome;
	}


	protected void setCognome(String cognome) {
		this.cognome = cognome;
	}

	protected int getEta() {
		return eta;
	}



	protected void setEta(int eta) {
		this.eta = eta;
	}


	public Persona(String nome, String cognome, int eta) {
		this.cognome = cognome;
		this.nome = nome;
		this.eta = eta;
	}

}
