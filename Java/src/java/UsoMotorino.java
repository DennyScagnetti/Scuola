package java;

public class UsoMotorino {

	public static void main(String[] args) {
		Motorino M = new Motorino("grigiometallizzato", "Piaggio Liberty", 40.5);
		double v = M.getVelocità();
		MotorinoImmatricolato MI1 = new MotorinoImmatricolato("rosso", "Aprilia Scarabeo", 30.5,60.0,"CV1234");
		MI1.getMax();
		MI1.accelera(30.7);
		M.accelera(30.7);
		System.out.println("Il motorino va a "+ M.getVelocità());
		System.out.println("Il motorino immatricolato va a "+ MI1.getVelocità());
		}

}
