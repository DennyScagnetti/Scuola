package java;

import java.util.*;

public class Vettore_dinamico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector V = new Vector(5);
Vector V1 = new Vector();
Vector V2 = new Vector(4,6);
Vector<Integer> V3 = new Vector<>(10);
V.add(5);
V.add(8);
if(V.contains(8))
	try {
		throw new PippoException("Erroree");
	} catch (PippoException e) {
		// TODO Auto-generated catch block
		e.printError();
	}
//V.add(4);
V.add(8);
V.add(9);
V2.add(3);
V2.add(3);
V2.add("Caio");
V3.add(6);
V2.add(3);
V2.add(3);
V2.add(3);
V.removeElementAt(2);
V.insertElementAt(4, 2);
V2.removeAllElements();
	}

}
