package java;

public class Triangolo_Colorato extends Triangolo_Isoscele{

	String colore_bordo, colore_sfondo;
	
	void setColori(String colore_bordo, String colore_sfondo) {
		this.colore_bordo = colore_bordo;
		this.colore_sfondo = colore_sfondo;
	}
	void setColori(String colore, boolean b) {
		if(b) {
			this.colore_bordo = colore;
		}
		else
		this.colore_sfondo = colore;
	}

	public static void main(String[] args) {

		Triangolo_Colorato T = new Triangolo_Colorato();
		T.setColori("rosso", true);//bordo rosso
		T.setColori("blu", false);//sfondo blu
		
	}

}
