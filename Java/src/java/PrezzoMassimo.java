package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Pag. 49 n°23
 * Dato un elenco di 10 prodotti con descrizione e prezzo, visualizzare il prezzo massimo 
 */
public class PrezzoMassimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double prezzo = 0, prezzoMassimo = 0;
int i=0;
String descrizione = "" , descrizionePrezzoMassimo = "";

InputStreamReader input = new InputStreamReader(System.in);
BufferedReader tastiera = new BufferedReader(input);

for(i=0; i<5; i++) {
	int c = i+1;
	System.out.println("Inserisci il prezzo n°"+ c + " e la propria descrizione");
	try {
		String prova = tastiera.readLine();
		prezzo = Double.valueOf(prova).doubleValue();
		prova = tastiera.readLine();
		descrizione = prova;
	}
	catch(Exception e) {
		System.out.println("ERRORE");
	}
	if(prezzo > prezzoMassimo) {
		prezzoMassimo = prezzo;
		descrizionePrezzoMassimo = descrizione;
	}
}
System.out.println("Il prezzo massimo è " +prezzoMassimo +" e la sua descrizione è "+ descrizionePrezzoMassimo );


	}
}
