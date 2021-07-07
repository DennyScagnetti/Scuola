package java;

import java.util.Vector;

public class Esempio2 {

	Vector E;

	public Esempio2() {
		E = new Vector();
	}

	public Esempio2 (Vector E1) {
		this.E = E1;
		E = new Vector();
	}

	public void Metodo1(Object O) {
		E.add(0,O);
	}

	public Object Metodo2() {
		Object O = null;
		if(E.size()!=0) {
			O = E.firstElement();
			E.remove(0);
		}
		return O;
	}

	public boolean Metodo3() {
		if(E.size() == 0)
			return true;
		else
			return false;
	}

	public Object Metodo4() {
		return E.firstElement();
	}
	
	
	public static void main(String[] args) {
		Esempio2 E = new Esempio2();
		E.Metodo1(1);
		E.Metodo1(1);
		E.Metodo1(3);
		System.out.println(E.Metodo2());
		System.out.println(E.Metodo4());
	}

}
