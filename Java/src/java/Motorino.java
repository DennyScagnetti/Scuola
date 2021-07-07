package java;

public class Motorino {

	String colore;
	double velocità;
	String tipo;
	boolean antifurto = false;
	
	public Motorino(String col, String tip, double vel) {
		colore = col;
		tipo = tip;
		velocità = vel;
	}
	
	public double getVelocità() {
		return velocità;
	}
	
	public void accelera(double vel_aggiunta) {
		if(antifurto ==  false) {
		velocità = velocità + vel_aggiunta;
		}
	}
	
	public void inserisciAntifurto() {
		antifurto = true;
	}


}
