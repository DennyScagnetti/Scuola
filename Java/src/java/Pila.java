 package java;

import java.util.Vector;

public class Pila {
	//attributo
	Vector P;
	
	//metodi
	public Pila() {
		P = new Vector();
	}
	
	public Pila (Vector P1) {
		this.P = P1;
		P = new Vector();
	}
	
	public void push(Object o) {
	P.add(0,o);//inserimeto all'inizio
	/*P.add(o)*/
	}
	
	public Object pop() {
		Object o = P.firstElement();
		P.remove(0);//rimozione dall'inizio
		return o;}
	
	public boolean isEmpty() {
		if(P.size() == 0)
			return true;
		else
		return false;
	}
	
	public Object top() {
		return P.firstElement();
	}
	public static void main(String[] args) {
	Pila PILA = new Pila();
	Libro L1 = new Libro(35, "Scuola", "Scagnetti");
	Libro L2 = new Libro(4, "Casa", "Scagnetti");
	Libro L3 = new Libro(15, "Nero", "Scagnetti");
	Libro L4 = new Libro(30, "Tavolo", "Scagnetti");
	Libro L5 = new Libro(46, "Computer", "Scagnetti");
	PILA.push(L1);
	PILA.push(L2);
	PILA.push(L3);
	PILA.push(L4);
	PILA.push(L5);
	PILA.pop();
	}

}
