package java;

public class Motore {
	
	private int cavalli;
	private int cilindri;
	private String stato;

	public int getCavalli() {
		return cavalli;
	}

	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
	}

	public int getCilindri() {
		return cilindri;
	}

	public void setCilindri(int cilindri) {
		this.cilindri = cilindri;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public void accendi() {
		this.stato="Acceso";
	}
	
	public void spegni() {
		this.stato="Spento";
	}
	
	public Motore(int cavalli, int cilindri) {
		this.cavalli = cavalli;
		this.cilindri = cilindri;
		this.stato = "Spento";
	}
}
