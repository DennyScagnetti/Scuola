package java;

public class MotorinoImmatricolato extends Motorino{

	double maxVelocità;
	String targa;
	
	public MotorinoImmatricolato(String col, String tip, double vel, double maxVel, String tar) {
		super(col, tip, vel);
		maxVelocità = maxVel;
		targa = tar;
	}
	
	public double getMax() {
		return maxVelocità;
	}
	
	public void accelera(double vel_aggiunta) {
		double s = vel_aggiunta+ super.velocità;
		if(s<maxVelocità) {
			super.velocità = s;
		}
		else {
			super.velocità = maxVelocità;
		}
	}


}
