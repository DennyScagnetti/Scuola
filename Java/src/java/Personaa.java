package java;

public class Personaa {
//attributi
	String nome_cognome ;
	String professione;
	String luogo_nascita;
	
	void cercaCognome() {
		nome_cognome.subSequence(nome_cognome.lastIndexOf(" ")+1, nome_cognome.length()-1);
	}

	public String getNome_cognome() {
		return nome_cognome;
	}

	public String getProfessione() {
		return professione;
	}

	public String getLuogo_nascita() {
		return luogo_nascita;
	}

	public void setNome_cognome(String nome_cognome) {
		this.nome_cognome = nome_cognome;
	}

	public void setProfessione(String professione) {
		this.professione = professione;
	}

	public void setLuogo_nascita(String luogo_nascita) {
		this.luogo_nascita = luogo_nascita;
	}
	
}
