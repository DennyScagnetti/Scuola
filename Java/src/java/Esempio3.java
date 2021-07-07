package java;

public class Esempio3 {

	Object O; 
	Esempio3 A;
	Esempio3 B;
	boolean C;
	public Esempio3(Object O, Esempio3 s, Esempio3 d, boolean C) {
		this.O = O;
		this.A = d;
		this.B = s;
		this.C=C;
	}
	public Esempio3(Object O, boolean radice) {
		this.O = O;
		this.A = null;
		this.B = null;
		this.C = C;
	}

	public boolean trovato(Object O) {
		if(this.O == O) {
			return true;
		}
			this.A.trovato(O);
			this.B.trovato(O);
			return false;
	}
	public static void main(String[] args) {
		Esempio3 E1 = null, E2 = null, E3 = null, E4 = null, E5 = null;
		E1 = new Esempio3(1, E3, E2, true);
		E2 = new Esempio3(2, E4, E5, false);
		E3 = new Esempio3(3, false);
		E4 = new Esempio3(4, false);
		E5 = new Esempio3(5, false);
		E1.trovato(4);
	}

}
