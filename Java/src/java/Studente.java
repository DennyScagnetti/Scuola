package java;

public class Studente extends Persona{
	String scuola;
	String indirizzo_scolastico;
	public Studente(String nome, String cognome, int eta, String scuola, String indirizzo_scolastico) {
		super(nome, cognome, eta);
		this.scuola = scuola;
		this.indirizzo_scolastico = indirizzo_scolastico;
	}
	
	//overloading
	public void cambiaNome(String nome) {
		super.setNome(nome); 
	}
	
	public void cambiaNome(String nome, String cognome) {
		super.setNome(nome); 
		super.setCognome(cognome); 
		}
	
	//overriding
	protected int getEta() {
		return 0;
	}
	
	public static void main(String[] args) {
		Studente S = new Studente("Denny", "Scagnetti", 27, "IIS Mattei", "via Leopardi");
		System.out.println("Il cognome è "+S.getCognome());
		
		
		
	}

}
