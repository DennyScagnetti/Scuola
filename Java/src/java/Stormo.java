package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stormo {
	//mascheramento
	private int numero_uccelli;
	private Uccello U[];
	
	//costruttore parametrizzato, dove si definisce la dimensione dell'array di uccelli in base al numero di uccelli nello stormo, quindi in base a numero_uccelli
	public Stormo(int numero_uccelli, Uccello U[]) {
		this.numero_uccelli = numero_uccelli;
		this.U = new Uccello[numero_uccelli];
	}
	//get e set degli attributi che fanno parte del mascheramento
	public int getNumero_uccelli() {
		return numero_uccelli;
	}

	public void setNumero_uccelli(int numero_uccelli) {
		this.numero_uccelli = numero_uccelli;
	}

	public Uccello[] getU() {
		return U;
	}

	public void setU(Uccello[] u) {
		U = u;
	}
	
	//se ci sono almeno la metà degli uccelli con le ali aperte, tutto lo stormo deve prendere il volo e se così fosse, il metodo restituisce vero, altrimenti restituisce falso
	public boolean tuttiInVolo() {
		int i, j = 0;
		for(i=0;i<numero_uccelli;i++) {
			if(U[i].stato.equals("aperte")) {
				j = j + 1;
			}
		}	
		if(j >= (numero_uccelli/2)) {
			for(i=0;i<numero_uccelli;i++) {
				if(U[i].stato == "chiuse") {
					U[i].cambiaStato();
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	//overloading del metodo precedente che prende come parametro in input un numero num, e se ci sono almeno num uccelli in volo, allora tutti gli uccelli dello stormo prendono il volo e il metodo restituisce vero, in tutti gli altri casi restituisce falso
	public boolean tuttiInVolo(int n) {
		int i, j = 0;
		for(i=0;i<numero_uccelli;i++) {
			if(U[i].stato.equals("aperte")) {
				j = j + 1;
			}
		}	
		if(j >= n) {
			for(i=0;i<numero_uccelli;i++) {
				if(U[i].stato == "chiuse") {
					U[i].cambiaStato();
				}
			}
			return true;
		} else {
			return false;
		}
		
	}
	
	//prende come parametro in input una stringa e restituisce il primo uccello che ha come nome quello della stringa inserita, altrimenti ritorna null
	public Uccello CercaUccello(String C) {
		int i;
		for(i=0;i<numero_uccelli;i++) {
			if(U[i].nome.equals(C)) {
				return U[i];
			}
		}	
	return null;//<-- se il compilatore raggiunge questo punto, vuol dire che pur passandosi tutti gli uccelli, non ha trovato quello che si cercava
	}
	
	//stampa per ogni riga ogni uccello dello stormo con tutte le informazioni che lo caratterizzano
	public void stampa() {
		int i;
		for(i=0;i<numero_uccelli;i++)
		System.out.println("Uccello numero " + (i+1) + " che sta "+U[i].stato1 +" e si chiama " + U[i].nome + ", ha le ali "+U[i].stato + " di colore "+U[i].colore + " lunghe "+U[i].lunghezza +" dm"+ "\n");
	}
	
	public static void main(String[] args) {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		//creare 4 uccelli
		String nome = "tizio", colore = "rosso";
		double lunghezza = 1;
		Uccello U1 = new Uccello(nome, colore, lunghezza);
		
		nome = "caio"; colore = "blu"; lunghezza = 2;
		Uccello U2 = new Uccello(nome, colore, lunghezza);
		
		nome = "sempronio"; colore = "giallo"; lunghezza = 2;
		Uccello U3 = new Uccello(nome, colore, lunghezza);
		 
		nome = "lulù"; colore = "verde"; lunghezza = 1;
		Uccello U4 = new Uccello(nome, colore, lunghezza);
		
		Uccello U[] = null;
		int i, scelta=0;
		Stormo S1 = new Stormo(4, U);
		
		S1.getU()[0]=U1;
		S1.getU()[1]=U2;
		S1.getU()[2]=U3;
		S1.getU()[3]=U4;
		
		//interagire con l'utente chiedendo se vuole cambiare lo stato a qualcuno di loro
		do {
		System.out.println("A quale uccello vuoi cambiare lo stato? Inserisci 0 per terminare ");
		
		try {
			String prova = tastiera.readLine();
			scelta = Integer.valueOf(prova).intValue();
		}
		catch(Exception E) {
			System.out.println("!!!");
		}
		
		if(scelta>0 && scelta<=S1.getNumero_uccelli()) {
			S1.getU()[scelta-1].stato1 = "in volo";
		}
		}
		while(scelta!=0);
		
		//Utilizzando il metodo corretto, portare tutti in volo se almeno 2 uccelli dello stormo lo sono
		S1.tuttiInVolo(2);
		
		//Cambiare il colore delle ali del terzo uccello in "rosa" e il nome del primo in "Passerotto" utillizzando i metodi appositi
		S1.getU()[2].setColore("Rosa");
		S1.getU()[0].setNome("Passerotto");
		
		//Stampare alla fine tutte le informazioni utilizzando il metodo appositamente creato
		S1.stampa();
	}



}
