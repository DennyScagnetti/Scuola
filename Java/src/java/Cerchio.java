package java;

import java.io.InputStreamReader;

public class Cerchio {
	//attributo
  private int raggio;
  private final double PIGRECO = 3.14;
	//metodo
	void stampaRaggio() {
		System.out.println("Il raggio è "+ raggio);
	}
	
	int getRaggio() {
		return raggio;
	}
	
	double getPIGRECO() {
		return PIGRECO;
	}
	//MASCHERAMENTO O INFORMATION HIDING
	void setRaggio(int raggio) {
		this.raggio = raggio;
	}
	
	double area() {
		double area = raggio*raggio*Cilindro.getPG();
		return area;
	}
	
	double circonferenza() {
		double circonferenza = raggio*2*PIGRECO;
		return circonferenza;
	}
	public static void main(String[] args) {
		int raggio;
	//	InputStreamReader input = new InputStreamReader(System.in);
		Cerchio C1;//dichiarazione dell'oggetto 
		C1 = new Cerchio();// creazione istanza dell'oggetto C1
		Cerchio C2 = new Cerchio();// creazione oggetto C2
		C1.setRaggio(10);
		C2.setRaggio(4);
		C1.stampaRaggio();
		System.out.println("Il raggio di C1 è "+ C1.getRaggio());
		System.out.println("L'area di C1 è "+ C1.area());
		System.out.println("Il raggio di C2 è "+ C2.getRaggio());
		System.out.println("L'area di C2 è "+ C2.area());
		Cerchio C3 = new Cerchio();
		C3.setRaggio(8);
		double area = C3.getRaggio()*C3.getRaggio()*C3.getPIGRECO();
		Cerchio C4;
		C4 = C1;
		if(C4 == C1)
			System.out.print("SOno uguali");
		
		Cerchio C5 = new Cerchio();
		Cerchio C6 = new Cerchio();
		C5.setRaggio(5);
		C6.setRaggio(5);
		
		if(C5 == C6) {
			System.out.print("SOno uguali");
		}
	}

}
