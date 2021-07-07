package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Scrivi un programma che, dati n numeri in ingresso, calcoli la somma di quelli di posto dispari (il 1°+ il 3°+ il 5° ecc..) e la somma di 
 * quelli di posto pari (il 2°+ il 4°+ il 6° ecc..). Il programma deve calcolare poi la differenza tra le due somme, visualizzando il risultato
 */
public class sommaDispari {

	public static void main(String[] args) {
	int n=0, i=0, somma_dispari=0, somma_pari=0, differenza_somme=0;
	int posto;
	//classi per lettura in input
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader tastiera = new BufferedReader(input);
	
	//richiesta lunghezza del vettore 
	do {
	System.out.println("Quanti numeri vuoi inserire? ");
	try {
		String prova = tastiera.readLine();
		n = Integer.valueOf(prova).intValue();
	}
	catch(Exception e) {
		System.out.print("Errore");
	}
	}
	while(n<0);
	
	//dichiarazione e caricamento del vettore
	int vett[] = new int [n];
	
	for(i=0; i<vett.length; i++) {
		System.out.println("Inserisci l'elemento nella posizione "+ i);
		try {
			String prova = tastiera.readLine();
			vett[i] = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.print("Errore");
		}
	}
	
	//calcolo somme
	for(i=0; i<vett.length; i++) {
		//   i    ->   0 - n-1
		// posto  ->   1 -  n
		posto = i+1;
		if(posto%2 == 0) {
			somma_pari = vett[i] + somma_pari;
		}
		else {
			somma_dispari = vett[i] + somma_dispari;
		}
		
	}
	System.out.println("La somma delle postazioni pari è "+ somma_pari + " e la somma delle postazioni dispari è "+ somma_dispari);
	
	differenza_somme = somma_pari - somma_dispari;
	System.out.println("La differenza tra le somme è "+ differenza_somme);
	}

}
