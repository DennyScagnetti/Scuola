package java;

public class Libreria{
	int numero_libri;
	Libro[] L ;

	public Libreria(int numero_libri, String autore, String  titolo, int prezzo) {
		this.numero_libri = numero_libri;
		this.L = new Libro[numero_libri];
		L[0]= new Libro(prezzo,autore,titolo);
		for(int i=1; i<numero_libri; i++) {
			L[i]= new Libro(0,"","");//crea tutti posti vuoti
		}
	}

	public int getNumero_libri() {
		return numero_libri;
	}

	public void setNumero_libri(int numero_libri) {
		this.numero_libri = numero_libri;
	}

	public Libro[] getL() {
		return L;
	}

	public void setL(Libro[] l) {
		L = l;
	}
	//controlla se c'è un libro vuoto nella posizione i
	public boolean postoVuoto(int posizione) {
		if(L[posizione].getAutore()=="" &&L[posizione].getPrezzo()==0 &&L[posizione].getTitolo()=="")
			return true;
		else return false;
	}
	public int postoVuoto() {
		for(int i=0; i<numero_libri; i++) {
			if(postoVuoto(i))
				return i;
		}
		return -1; 
	}
	public boolean libreriaPiena() {
		if(postoVuoto()==-1) {
			System.out.println("Libreria piena!!");
			return true;
		}
		else return false;
	}
	public boolean libreriaVuota() {
		if(postoVuoto()==numero_libri) {
			System.out.println("Libreria vuota!!");
			return true;
		}
		else return false;
	}
	//inserisce un libro nel vettore e se il vettore è pieno, avvisa l'utente
	public void aggiungiLibro(int prezzo, String autore, String  titolo) {
		if(!libreriaPiena()) {
			
			this.L[postoVuoto()] =new Libro(prezzo, autore, titolo);
			System.out.println("Hai inserito un nuovo libro!");
		}
	}
	//rimuove un libro dal vettore della libreria e lascia un libro vuoto
	public void rimuoviLibro(int posizione) {
		if(!libreriaVuota()) {
			L[posizione]= new Libro(0,"","");
			System.out.println("Libro rimosso!");
		}
	}
	public void stampaLibreria() {
		for(int i=0; i<numero_libri; i++) {
			int a= i+1;
			if(!postoVuoto(i))
			System.out.println("Libro "+ a + ": \n"+ "Autore: "+ this.L[i].getAutore() +"  Titolo: "+ this.L[i].getTitolo() + " Prezzo: "+ this.L[i].getPrezzo()+" euro");
		}
	}
	
	public static void main(String[] args) {
		
		Libreria Lib=new Libreria(10, "Denny", "Il mare", 20);
		Lib.aggiungiLibro(15, "Marco", "Bello");
		Lib.stampaLibreria();
		
	}

}
