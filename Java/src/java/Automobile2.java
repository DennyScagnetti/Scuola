package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Automobile2 extends Motore{
	private String nome;
	private String targa;
	private int numero_sedili;
	
	
	public void accendi() {
		System.out.println("L'Automobile è accesa");
		super.accendi();
	}
	
	public void spegni() {
		System.out.println("L'Automobile è spenta");
		super.spegni();
	}
	
	public Sedile[] generaSedili() {
		Sedile SA[] = new Sedile[this.numero_sedili];
		return SA; 
	}
	

	public boolean cambiarePosizione(int posizione_sedile){
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		boolean riprova = true, risposta = false;
		do {
		System.out.println("Vuoi davvero cambiare la posizione al sedile "+ posizione_sedile+ "?  Risp con S/N");
		String risp=""; 
		riprova = false;
		risposta=true;
		try {
		 risp = tastiera.readLine();
	}
	catch(Exception e) {
		System.out.print("Errore");
	}
		if(risp.contentEquals("S") || risp.contentEquals("s")) {
			
		risposta = true;
		}
		else if (risp.contentEquals("N") || risp.contentEquals("n")) {
		risposta = false;
		}
		else {riprova = true; System.out.println("Riprova!!");}
	}while(riprova);
		return risposta;}
	
	
	public void cambiarePosizione(Sedile S){
		if(S.getPosizione().contentEquals("Alzato")) {
			S.abbassa();
		}
		else S.alza();
	}
	public void cambiarePosizione(Sedile S,String risposta) {
		if(risposta.contentEquals("AB") || risposta.contentEquals("ab")) S.abbassa();
		else S.alza();
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getNumero_sedili() {
		return numero_sedili;
	}

	public void setNumero_sedili(int numero_sedili) {
		this.numero_sedili = numero_sedili;
	}

	public void controlla_targa() {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		boolean targa_valida;
		do {
			targa_valida=true;
		System.out.println("Che targa ha la Ferrari?");
		try {
			 String prova = tastiera.readLine();
			this.setTarga(prova);
		}
		catch(Exception e) {
			targa_valida=false;
			System.out.print("Errore");
		}
		
			
		if(this.getTarga().length() == 7) {
		
			int test_intero=0;
			char test_carattere = 'a';
			char test_CARATTERE = 'A';
			
			try {
				test_intero = Integer.valueOf(this.getTarga().substring(2,4)).intValue();
			}
			
			catch(Exception e) {
				targa_valida=false;
				System.out.print("Targa Sbagliata!! I 3 caratteri centrali devono essere numeri!");
				continue;
			}
			for(int j=0; j<7; j++) {
			for(int i=0; i<26; i++) {
				if(j>1 && j<5) {
					i=26; continue;
					}
				
				char a = (char) (test_carattere+i);
				char A = (char) (test_CARATTERE+i);
				//System.out.print(A +" ");
					if(this.getTarga().charAt(j) == a)
					{
						test_intero++;
					}
					if(this.getTarga().charAt(j) == A)
					{	
						test_intero++;
					}
					}
		}
			if(test_intero!=4) {
				targa_valida=false;
				System.out.println("Targa Sbagliata!! I primi 2 e gli ultimi 2 caratteri devono essere lettere!");
				continue;
				}
		}
		else {
			targa_valida=false;
			System.out.println("Targa Sbagliata!! Deve avere 7 caratteri!");
			continue;
			}
		} while(!targa_valida);
		
	}
	public Automobile2(int cavalli, int cilindri, String nome, String targa, int numero_sedili) {
	super(cavalli, cilindri);
	this.nome = nome;
	this.targa = targa;
	this.numero_sedili = numero_sedili;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int pos=-1;
		Automobile2 Ferrari = new Automobile2(500, 12, "Ferrari", "AX000XA", 4);
		Sedile Sedili_Ferrari[] = Ferrari.generaSedili();
		for(int i=0; i<Sedili_Ferrari.length; i++) {
			Sedili_Ferrari[i] = new Sedile("Pelle");
		}
		do {
		System.out.println("A quale sedile vuoi cambiare posizione?");
		
		try {
			 String prova = tastiera.readLine();
			pos= Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.print("Errore");
		}
		
		} while(pos<0 || pos>4);
		Ferrari.cambiarePosizione(pos);
	//	Ferrari.cambiarePosizione(Ferrari.sedili_Auto[pos]);//<-- cambia la posizione in automatico, senza chiedere all'utente se vuole alzare o abbassare
		//Se si vuole chiedere invece...
		String risposta="";
		do {
		System.out.println("Vuoi alzarlo o abbassarlo? AL/AB");
		try {
			 risposta= tastiera.readLine();
			
		}
		catch(Exception e) {
			System.out.print("Errore");
		}
		risposta= risposta.toUpperCase();//trasformiamo tutto in maiuscolo per evitare problemi di lettere un po' maiuscole e un po' minuscole; si può anche trasformare tutto in minuscolo e fare il ragionamento inverso
		} while(!risposta.contentEquals("AB") && !risposta.contentEquals("AL"));
		Ferrari.cambiarePosizione(Sedili_Ferrari[pos], risposta);
		Ferrari.controlla_targa();
		Ferrari.accendi();
	}

}
