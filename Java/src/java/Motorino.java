package java;

public class Motorino {

	String colore;
	double velocit�;
	String tipo;
	boolean antifurto = false;
	
	public Motorino(String col, String tip, double vel) {
		colore = col;
		tipo = tip;
		velocit� = vel;
	}
	
	public double getVelocit�() {
		return velocit�;
	}
	
	public void accelera(double vel_aggiunta) {
		if(antifurto ==  false) {
		velocit� = velocit� + vel_aggiunta;
		}
	}
	
	public void inserisciAntifurto() {
		antifurto = true;
	}


}
