package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/*dato un elenco di articoli definito da codice, descrizione e prezzo, si vuole gestire l'inserimento, 
 *la cancellazione e la stampa degli articoli tramite menu*/
public class Articolo {

	String codice;
	String descrizione;
	double prezzo;

	Articolo(String codice,	String descrizione,	double prezzo){
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public static void main(String[] args) {
		Vector V = new Vector();
		int scelta=0;
		String codice="";
		String descrizione="";
		double prezzo=0;
		System.out.println("Cosa vuoi fare?");
		System.out.println("1) inserire un articolo");
		System.out.println("2) cancellare un articolo");
		System.out.println("3) stampare un articolo");
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		try {
			String prova = tastiera.readLine();
			scelta = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.println("Errore");
		}
		
		while(scelta !=0) {
			if(scelta==1) {
				try {
					codice = tastiera.readLine();
					descrizione = tastiera.readLine();
					String prova = tastiera.readLine();
					prezzo = Double.valueOf(prova).doubleValue();
				}
				catch(Exception e) {
					System.out.println("Errore");
				}
				Articolo A = new Articolo(codice,descrizione,prezzo);
				V.add(A);
			}
		}
	}

}
