package java;

import java.io.*;
public class Magazzino {

	public static void main(String[] args) {
		String scelta = "";
		String descrizione = "", prova = "";
		int numero_reparto = 0, conta_prodotti_reparto1 = 0, conta_prodotti_reparto2 = 0, conta_prodotti_reparto3 = 0, tot_prodotti=0;
		double prezzo=0.0;

		try {
			FileOutputStream f = new FileOutputStream("prodotti.dat");
			ObjectOutputStream fOUT = new ObjectOutputStream(f);
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader tastiera = new BufferedReader(input);
			do {
				System.out.println("Vuoi inserire un prodotto nel magazzino? S\\N");
				scelta =  tastiera.readLine();
				scelta = scelta.toLowerCase();
				if(scelta.equals("n")) break;
				else if(!scelta.equals("s"))
					System.out.println("Risposta errata, riprova!");	
				else {
					System.out.println("Inserisci la descrizione del prodotto");
					descrizione = tastiera.readLine();
					
						do {
						System.out.println("Inserisci il numero del reparto del prodotto");
						prova = tastiera.readLine();
						numero_reparto = Integer.valueOf(prova).intValue();
						if(numero_reparto <0 || numero_reparto >3)
							System.out.println("Errato numero reparto, scegliere tra 1 o 2 o 3");
						}while(numero_reparto <0 || numero_reparto >3);
						
					System.out.println("Inserisci il prezzo del prodotto");
					prova = tastiera.readLine();
					prezzo = Double.valueOf(prova).doubleValue();
				
					Prodotto Inserito = new Prodotto(descrizione, numero_reparto, prezzo);
					fOUT.writeObject(Inserito);
					tot_prodotti++;
				}		
				
			}
			while(true);
	
			fOUT.flush();
			f.close();
			System.out.println("FINE INSERIMENTO PRODOTTI");
		}
		catch(Exception e) {
			System.out.println("Errore nell'inserimento dei prodotti");
		}
		
		try {
			FileInputStream f = new FileInputStream("prodotti.dat");
			ObjectInputStream fIN = new ObjectInputStream(f);
			
			for(int i=0; i<tot_prodotti; i++) {
				Prodotto p;
				p = (Prodotto) fIN.readObject();
				if(p.numero_reparto == 1) {
					conta_prodotti_reparto1++;
				}
				else if(p.numero_reparto == 2) {
					conta_prodotti_reparto2++;
				}
				else {
					conta_prodotti_reparto3++;
				}
				
			}
			f.close();
		}
		catch(Exception e) {
			System.out.println("Errore nel conteggio dei prodotti dei prodotti");
		}
		System.out.println("Sono stati memorizzati " + conta_prodotti_reparto1 + " prodotti del reparto 1");
		System.out.println("Sono stati memorizzati " + conta_prodotti_reparto2 + " prodotti del reparto 2");
		System.out.println("Sono stati memorizzati " + conta_prodotti_reparto3 + " prodotti del reparto 3");
	}

}
