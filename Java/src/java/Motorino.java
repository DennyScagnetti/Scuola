package java;

public class Motorino {

	String colore;
	double velocitÓ;
	String tipo;
	boolean antifurto = false;
	
	public Motorino(String col, String tip, double vel) {
		colore = col;
		tipo = tip;
		velocitÓ = vel;
	}
	
	public double getVelocitÓ() {
		return velocitÓ;
	}
	
	public void accelera(double vel_aggiunta) {
		if(antifurto ==  false) {
		velocitÓ = velocitÓ + vel_aggiunta;
		}
	}
	
	public void inserisciAntifurto() {
		antifurto = true;
	}


}
