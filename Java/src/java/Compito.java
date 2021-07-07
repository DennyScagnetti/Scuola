package java;

import java.util.Vector;

public class Compito {
	
	
	public static void main(String[] args) {
		Vector<Integer> V = new Vector<Integer>();
		V.add(1);
		V.add(5);
		V.add(7);
		V.add(80);
		V.add(3);
		V.removeElement(7);
		System.out.println(V.elementAt(2));
	}

}
