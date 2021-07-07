package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*L'utente inserisce da tastiera numeri interi pari in continuazione, se il numero inserito è dispari,
 * interrompi l'inserimento dei numeri*/
public class Continue_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0; // valore che verrà inserito
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		/*do {
		try {
			String prova = tastiera.readLine();
			numero = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.println("Errore");
		}
		}
		while(numero%2==0);*/
		/*
		System.out.println("Inserisci numeri pari");
		while(true) {
			try {
				String prova = tastiera.readLine();
				numero = Integer.valueOf(prova).intValue();
			}
			catch(Exception e) {
				System.out.println("Errore");
			}
			if(numero%2==1) {
				System.out.println("BREAK");
				break;
			}
			
		}*/
		/*
		 * Conta tutti inseriti dall'utente tranne i numeri dispari e quando inserisce 0 
		 * interrompi l'inserimento*/
		int conta=0;
		
		do {
		try {
			String prova = tastiera.readLine();
			numero = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.println("Errore");
		}
		if(numero==0) {
			break;		//interrompe  ed esce dal ciclo while completamente
		}
		if(numero%2==1) {
			continue; 	// interrompe il ciclo corrente e ricominca con il ciclo successivo
		}
		conta++;
		}
		while(true);
		
		System.out.print("FINE");
	}

}
