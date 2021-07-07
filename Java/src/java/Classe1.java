package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Classe1 {
	int a = 7;

	void f() {
		int a;
		a = 9;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.println("Qual'è il tuo nome?");
		String nome ="", cognome="";
		try {
			nome = tastiera.readLine();
		}
		catch(Exception e) {
			System.out.print("C'è stato un problema con l'inserimento del nome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scope
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int a= 10;
		final float f = 10;
		double d = 10.2;
		double d1 = 999999.5;
		char c = 's';
		String parola = "ciao";
		boolean b = false;
		d = (double)a/(double)4;
		System.out.println("d"+"= "+ d+ a);
		int s = (int)d + (int)d1;
		System.out.println("s= "+ s);
		int somma = 3+5;
		int differenza = 3-5;
		double divisione = 5/1;
		int moltiplicazione = 4*4;
		int modulo = 10%3;
		int k = 9;
		int j = ++k + 1; // j = 11 k = 10
		k = 9;
		j = k++ + 1; // j = 10 k = 10
		
		/*raguPolbwv
		 * soughuor
		 * OEFNpf
		 * OINEFIPg*/

		
		System.out.println("Qual'è il tuo nome?");
		String nome ="", cognome="";
		try {
			nome = tastiera.readLine();
		}
		catch(Exception e) {
			System.out.print("C'è stato un problema con l'inserimento del nome");
		}
	System.out.println("Qual è il tuo cognome?");
	try {
		cognome = tastiera.readLine();
	}
	catch(Exception e) {
		System.out.print("C'è stato un problema con l'inserimento del cognome");
	}
	
	
	if(k==10 || k<7) {
		System.out.println("Fuori piove");
	}
	else {
		System.out.println("Fuori c'è il sole");
	}
	
	}

}
