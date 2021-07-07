package java;

import java.util.Vector;

public class Esempio1 {

	Vector V;
	
	public void Metodo1(Object O) {
		V.addElement(O);
	}

	public Object Metodo2() {
		Object O=null;
		if(V.size() != 0) {
			O=V.firstElement();
			V.remove(V.firstElement());
		}
		return O;
	}

	public boolean Metodo3() {
		if(V.size()==0)
			return true;
		else return false;
	}

	public int Metodo4() {
		return V.size();
	}
	
	public static void main(String[] args) {
		Esempio1 E = new Esempio1();
		E.Metodo1(1);
		E.Metodo1(2);
		E.Metodo1(3);
		System.out.println(E.Metodo2());
		System.out.println(E.Metodo2());
	}

}
