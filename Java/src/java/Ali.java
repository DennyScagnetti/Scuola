package java;

public class Ali {
	
	String colore; 
	String stato;
	double lunghezza;
	
	//creare un costruttore parametrizzato, di default, le ali sono chiuse
	public Ali(String colore, double lunghezza) {
		this.lunghezza = lunghezza;
		this.colore = colore;
		this.stato = "chiuse";
	}
	
	//modifica lo stato da "aperte" a "chiuse" o viceversa e ritorna il contenuto dell'attributo stato
	public String cambiaStato(){
		if(stato.equals("chiuse")) {
			stato = "aperte";
		} else if (stato.equals("aperte")) {
			stato = "chiuse";
		}
		return stato;
	}
	
	//set e get degli attributi
	public void setStato(String S){
		this.stato = S;
	}
	
	public void setColore(String C){
		this.colore = C;
	}
	
	public void setLunghezza(double L){
		this.lunghezza = L;
	}
	
	public String getStato(){
		return stato;
	}
	
	public String getColore(){
		return colore;
	}
	
	public double getLunghezza(){
		return lunghezza;
	}
	

	
	
	
/*
Realizzare una classe Ali con attributi stato (che può essere aperte o chiuse);

 */
	
	/*Realizzare una classe Ali con attributi colore, lunghezza, stato(che può essere aperte o chiuse);
	metodi della classe --> set e get degli attributi, cambiaStato() che modifica lo stato da "aperte" a "chiuse" o viceversa e ritorna il contenuto dell'attributo stato;
	 creare un costruttore parametrizzato. Di default, le ali sono chiuse.

	Realizzare una classe Uccello, estensione  della classe Ali, con attributi nome, stato(a terra o in volo);
	metodi della classe --> set e get degli attributi, overriding cambiaStato() che modifica lo stato da "a terra" a "in volo" se cambia lo stato delle ali da chiuso ad aperto; creare un costruttore parametrizzato. Di default, gli uccelli sono a terra.

	Realizzare la classe Stormo(applicando la proprietà del mascheramento) con attributo un array di Uccelli, numero_uccelli;
	metodi della classe --> costruttore parametrizzato, dove si definisce la dimensione dell'array di uccelli in base al numero di uccelli nello stormo, quindi in base a numero_uccelli;
	tuttiInVolo --> se ci sono almeno la metà degli uccelli con le ali aperte, tutto lo stormo deve prendere il volo e se così fosse, il metodo restituisce vero, altrimenti restituisce falso.
	fare l'overloading del metodo precedente che prende come parametro in input un numero num, e se ci sono almeno num uccelli in volo, allora tutti gli uccelli dello stormo prendono il volo e il metodo restituisce vero, in tutti gli altri casi restituisce falso. 
	CercaUccello --> prende come parametro in input una stringa e restituisce il primo uccello che ha come nome quello della stringa inserita, altrimenti ritorna null.
	creare infine un metodo che stampa per ogni riga ogni uccello dello stormo con tutte le informazioni che lo caratterizzano.

	Nel main creare 4 uccelli(anche con ali uguali) e successivamente interagire con l'utente chiedendo se vuole cambiare lo stato a qualcuno di loro.
	Utilizzando il metodo corretto, portare tutti in volo se almeno 2 uccelli dello stormo lo sono. Cambiare il colore delle ali del terzo uccello in "rosa" e il nome del primo in "Passerotto" utillizzando i metodi appositi.
	Stampare alla fine tutte le informazioni utilizzando il metodo appositamente creato.*/

}
