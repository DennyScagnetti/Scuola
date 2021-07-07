package java;

			/*Crea un programma dotato di una classe 'potenza' che 
            implementa la potenza del 2 dei numeri (interi) associati agli oggetti 
            istanziati della classe.
            La classe deve essere dotata di costruttore, di un metodo pow() che 
            stampi a video la potenza del numero associato all'oggetto, e di un 
            metodo cambiobase() che deve permettere di cambiare base alla potenza 
            da calcolare.*/
public class Potenza {
	//attributo
	private int base; 
	
	//costruttore 
	Potenza(int b){
		base = b;
	}
	
	Potenza(int c, int s){
		inserisciBase();
	}
	Potenza(){
		
	}
	
	//metodi
	public void pow() {
		int soluzione;
		soluzione = base*base;
		System.out.println("Il quadrato di "+ base + " è "+ soluzione);
	}
	
	public void cambiobase(int nuovaBase) {
		base = nuovaBase;
	}
	
	public void inserisciBase() {
		System.out.println("Inserisci la base ");
		//.... roba in input
		
	}
	public static void main(String[] args) {
		Potenza p1 = new Potenza(5);
		p1.pow();
		p1.cambiobase(4);
		p1.pow();
		Potenza p2 = new Potenza();
		
		
	}

}
