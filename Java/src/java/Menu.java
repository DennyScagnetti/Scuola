package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Sia data una sequenza di numeri interi positivi diversi da zero.  I valori sono letti da tastiera e hanno come tappo l'inserimento dello zero. 
 * Presenta un menu per l'esecuzione delle seguenti opzioni:
1) calcolo  del numero di coppie consecutive uguali;
2) calcolo del numero di coppie in cui il secondo numero è divisore del primo (non uguali);
3) visualizzazione del messaggio che dica quali tipo di coppie tra i due precedenti è presente in numero maggiore.*/

public class Menu {

	public static void main(String[] args) {
		
		int vett[] = new int [1000];
		int numero=0;
		int scelta=0;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int i=0;
		System.out.println("Inserisci una seri di numeri interi positivi, terminandola con uno 0 alla fine");
		do {
		try {
			String prova = tastiera.readLine();
			numero= Integer.valueOf(prova).intValue();
			
			if(numero >0) {
			vett[i] = numero;
			i++;
			}
		}
		catch(Exception e) {
			System.out.print("Errore");
		}
		}
		while(numero != 0);
		
		System.out.println("\nMENU");
		System.out.println("1) calcolo del numero di coppie consecutive uguali;");
		System.out.println("2) calcolo del numero di coppie in cui il secondo numero è divisore del primo (non uguali);");
		System.out.println("3) visualizzazione del messaggio che dica quali tipo di coppie tra i due precedenti è presente in numero maggiore.");
	
		try {
			String prova = tastiera.readLine();
			scelta = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.print("Errore");
		}
		

	
	}

}
