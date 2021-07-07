package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
//pag.184 n°11
/* Simulare le operazioni (ordina, soddisfa) relative alla gestione
 *  delle ordinazioni eseguite da un bar, creando un menu attraverso
 *  il quale, da tastiera, si specifica quale tipo di operazione
 *  effettuare. È necessario effettuare il controllo che non possa
 *  essere eseguita l'operazione soddisfa se prima non è stata 
 *  eseguita almeno un'operazione ordina*/
/*CODA o FILA */

public class Ordinazione {
	
	Vector<Ordine> V;
	
	public Ordinazione () {
		this.V = new Vector();
	}
	public void menu() {
		System.out.println("MENU ");
		System.out.println("1) Ordina");
		System.out.println("2) Soddisfa");
		System.out.println("3) Esci");
	}
	public Ordine ordina() {
		String nome_bevanda="";
		String nome_spuntino="";
		boolean b=false;
		Ordine O = new Ordine("");
		int scelta=0;
		do {
			b=false;
		System.out.println("Che cosa vuoi ordinare?");
		System.out.println("1) Bevanda");
		System.out.println("2) Spuntino");
		System.out.println("3) Entrambi");		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		try {
			String prova = tastiera.readLine();
			scelta = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.println("Errore valore inserito");
		}
		
		switch(scelta) {
		
		case 1: 
			System.out.println("Inserisci la bevanda ");
			try {
				nome_bevanda = tastiera.readLine();
			}
			catch(Exception e) {
				System.out.println("Errore valore inserito");
			}
			O = new Ordine(nome_bevanda); 
			System.out.println("Bevanda inserita nelle ordinazioni");
			break;
		case 2: 
			System.out.println("Inserisci lo spuntino");
			try {
				nome_spuntino = tastiera.readLine();
			}
			catch(Exception e) {
				System.out.println("Errore valore inserito");
			}
			O = new Ordine(nome_spuntino, b); 
			System.out.println("Spuntino inserito nelle ordinazioni");
			break;
		case 3: 
			System.out.println("Inserisci la bevanda e lo spuntino");
			try {
				nome_bevanda = tastiera.readLine();
				nome_spuntino = tastiera.readLine();
			}
			catch(Exception e) {
				System.out.println("Errore valore inserito");
			}
			O = new Ordine(nome_bevanda, nome_spuntino); 
			System.out.println("Bevanda e spuntino inseriti nelle ordinazioni");
			break;
		default:
			b=true;
		}
		}while(b);
		this.V.add(O);
		return O;
	}
	public Ordine soddisfa() {
		Ordine Ordine_daRimuovere;
		if(this.V.isEmpty()) {
			System.out.println("Errore, ordinare prima di soddisfare");
			return null;
		}
		else{Ordine_daRimuovere = this.V.firstElement();
		this.V.remove(0);
		if(Ordine_daRimuovere.nome_spuntino=="") {
		System.out.println("Hai soddisfatto la bevanda "+ Ordine_daRimuovere.nome_bevanda);}
		else if(Ordine_daRimuovere.nome_bevanda=="") {
		System.out.println("Hai soddisfatto lo spuntino "+ Ordine_daRimuovere.nome_spuntino);}
		else {System.out.println("Hai soddisfatto la bevanda "+ Ordine_daRimuovere.nome_bevanda +" e lo spuntino "+ Ordine_daRimuovere.nome_spuntino);}
		return Ordine_daRimuovere;
	}}
	public static void main(String[] args) {
		int scelta=0;
		Ordinazione O = new Ordinazione ();
		do {
		O.menu();
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		try {
			String prova = tastiera.readLine();
			scelta = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.println("Errore scelta inserita");
		}
		switch(scelta) {
		case 1: 
			O.ordina();
			break;
		case 2:
			O.soddisfa();
			break;
		case 3:
			System.out.println("Sei uscito dal menu");
		}
		}while(scelta !=3);
	}

}
