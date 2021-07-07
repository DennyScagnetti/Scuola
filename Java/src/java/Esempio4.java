package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Esempio4 {

	Object O;
	Esempio4 L;
	boolean t;

	public Esempio4(Object o, Esempio4 L, boolean testa) {
		this.O = o;
		this.L = L;
		this.t = testa;
	}
	public Esempio4(Object o) {
		this.O = o;
		this.L = null;
		this.t = false;
	}

	public void Metodo1(Object O) {
		this.O = O;
	}

	public Object Metodo2() {
		Object o = this.O;
		this.O = null;
		this.L = null;
		return o;
	}

	public void Metodo3(Esempio4 L1) {
		while(L.L != null) {
			L = L.L;
		}
		L.L = L1;
	}

	public static void Metodo4(Esempio4 L1, Esempio4 L2) {
		while(L1.L != null) {
			L1 = L1.L;
		}
		L1.L = L2;
	}
	public Object Metodo5() {
		return this.O;
	}

	public static void main(String[] args) {
		String parola="";
		Esempio4 E4 = null;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.println("Inserisci una parola");
		try {
			E4 = new Esempio4(tastiera.readLine());
		}
		catch(Exception e) {
			System.out.println("Errore!!");
		}
		do {
			System.out.println("Continua ad inserire una parola, se vuoi smettere premi 0");

			try {
				if(!tastiera.readLine().equals("0")) 
				{
					E4 = E4.L;
					E4.O = tastiera.readLine();
					E4.L = null;
				}
				else break;
			}
			catch(Exception e) {
				System.out.println("Errore!!");
			}
		}while(true);
	}

}
