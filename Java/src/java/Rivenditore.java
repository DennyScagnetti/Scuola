package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rivenditore {

	Autoarticolato [] A;
	public Rivenditore(int numero_autoarticolati) {
		this.numero_autoarticolati = numero_autoarticolati;
		this.A=new Autoarticolato[numero_autoarticolati];
	}
	private Autoarticolato[] getA() {
		return A;
	}
	private void setA(Autoarticolato[] a) {
		A = a;
	}
	private int getNumero_autoarticolati() {
		return numero_autoarticolati;
	}
	private void setNumero_autoarticolati(int numero_autoarticolati) {
		this.numero_autoarticolati = numero_autoarticolati;
	}
	int numero_autoarticolati;
	
	public Autoarticolato vendi() {
		Autoarticolato A = this.A[0];
		this.A[0] = null;
		return A;
	}
	
	public Autoarticolato vendi(String targa) {
		Autoarticolato A;
		for(int i=0; i<this.numero_autoarticolati; i++) {
			if(this.A[i].targa.equals(targa)) {
				A = this.A[i];
				this.A[i]=null;
				return A;
		 }
		}
		return null;
	}
	
	public boolean scambiaTarga(int pos1, int pos2) {
		String targa;
		if(pos1<0 || pos1>this.numero_autoarticolati || pos2<0 || pos2>this.numero_autoarticolati)
			return false;
		else	{
			targa = this.A[pos1].targa;
		this.A[pos1].targa = this.A[pos2].targa;
		this.A[pos2].targa = targa;
		return true;}
	}
	
	public void stampaAutoarticolati() {
		int a;
		for(int i=0; i<this.numero_autoarticolati; i++) {
			a=i+1;
			System.out.print("Il trattore stradale n°"+ a + "che pesa "+ this.A[i].peso + " ed ha "+this.A[i].numero_ruote+ " ruote, il suo motore è "+ this.A[i].motore + "e la sua targa è "+this.A[i].targa+". ");
			System.out.println("Il peso del suo rimorchio vale "+ this.A[i].peso_rimorchio + " e la sua lunghezza totale è "+this.A[i].lunghezza_totale);
		}
	}
	public static void main(String[] args) {
		int numero_autoarticolati = 5;
		boolean flag = true;
		String risposta;
		Rivenditore R = new Rivenditore(numero_autoarticolati);
		Autoarticolato A1 = new Autoarticolato(5000, "AA000AA", 30000, 12);
		Autoarticolato A2 = new Autoarticolato(5000, "AB010VA", 20000, 13);
		Autoarticolato A3 = new Autoarticolato(5000, "XA101AN", 20000, 13);
		Autoarticolato A4 = new Autoarticolato(5000, "BA444MA", 10000, 11);
		Autoarticolato A5 = new Autoarticolato(5000, "GA678EE", 50000, 11);
		R.A[0] = A1;
		R.A[1] = A2;
		R.A[2] = A3;
		R.A[3] = A4;
		R.A[4] = A5;
		R.A[numero_autoarticolati-1].aggiungiRuota();
		R.A[numero_autoarticolati-1].aggiungiRuota();
		R.scambiaTarga(1, 2);
		R.stampaAutoarticolati();
		try {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.println("Vuoi comprare uno degli autoarticolati esposti? S\\N");
		do {
		risposta = tastiera.readLine();
		if(risposta.toUpperCase().equals("S")) {
			System.out.println("Qual è la targa dell'autoarticolato che vuole comprare?");
			risposta = tastiera.readLine();
			for(int i=0; i<numero_autoarticolati; i++) {
				if(R.A[i].targa.equals(risposta)) {
					R.vendi(risposta);
					flag = false;
			 }
				
			}
			if(flag)
			System.out.println("Nessun autoarticolato ha quella targa, riprova.");
		}
		}while(flag);
		}
		catch(Exception e) {
			
		}
	}

}
