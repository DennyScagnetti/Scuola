package java;

import java.util.Vector;

public class Coda {

	Vector C;

	public void aggiungi(Object O) {
		C.addElement(O);
	}

	public Object togli() {
		Object O=null;
		if(C.size() != 0) {
			O=C.firstElement();
			C.remove(C.firstElement());
		}
		return O;
	}

	public boolean vuota() {
		if(C.size()==0)
			return true;
		else return false;
	}

	public int size() {
		return C.size();
	}
	


}
