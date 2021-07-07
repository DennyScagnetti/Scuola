package java;

public class MotorinoImmatricolato extends Motorino{

	double maxVelocit�;
	String targa;
	
	public MotorinoImmatricolato(String col, String tip, double vel, double maxVel, String tar) {
		super(col, tip, vel);
		maxVelocit� = maxVel;
		targa = tar;
	}
	
	public double getMax() {
		return maxVelocit�;
	}
	
	public void accelera(double vel_aggiunta) {
		double s = vel_aggiunta+ super.velocit�;
		if(s<maxVelocit�) {
			super.velocit� = s;
		}
		else {
			super.velocit� = maxVelocit�;
		}
	}


}
