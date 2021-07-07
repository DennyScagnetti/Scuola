package java;

public class Trattore_Stradale {
	int peso;
	int numero_ruote;
	String motore;
	String targa;
	 public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	int getPeso() {
		return peso;
	}
	 void setPeso(int peso) {
		this.peso = peso;
	}
	 int getNumero_ruote() {
		return numero_ruote;
	}
	 void setNumero_ruote(int numero_ruote) {
		this.numero_ruote = numero_ruote;
	}
	 String getMotore() {
		return motore;
	}
	 void setMotore(String motore) {
		this.motore = motore;
	}
	
	 void aggiungiRuota() {
		 this.numero_ruote ++;
	 }
	
	 void rimuoviRuota() {
		 if(motore.equals("spento"))
			 this.numero_ruote--;
	 }
	 
	 public Trattore_Stradale(int peso, String targa) {
		 this.numero_ruote = 4;
		 this.motore = "spento";
		 this.peso = peso;
		 this.targa = targa;
	 }
}
