package java;
/*Realizzare una classe Trattore_Stradale con attributi peso, numero_ruote, motore(che può essere o acceso o spento), targa.
metodi della classe --> set e get degli attributi.
aggiungiRuota--> aumenta il numero di ruote sul trattore di 1 unità. 
rimuoviRuota --> toglie una ruota solo se il motore è spento.
Creare un costruttore parametrizzato in cui, di default, il motore è spento e le ruote sono 4.

Realizzare una classe Autoarticolato, estensione  della classe Trattore_Stradale, con attributi peso_rimorchio, lunghezza_totale.
metodi della classe --> set e get degli attributi.
overriding getPeso --> restituisce il peso complessivo dell'autoarticolato
Creare un costruttore parametrizzato.

Realizzare la classe Rivenditore(applicando la proprietà del mascheramento) con attributo un array di Autoarticolati, numero_autoarticolati.
metodi della classe --> costruttore parametrizzato, dove si definisce la dimensione dell'array di autoarticolati in base al numero di autoarticolati presenti nella rivendita, quindi in base a numero_autoarticolati;
vendi --> vende(e quindi elimina dall'array) il primo autoarticolato presente nell'array e lo restituisce alla fine del metodo.
fare l'overloading del metodo precedente che prende come parametro in input una stringa, se è presente un autoarticolato che ha come targa quella stringa, verrà venduto(e quindi eliminato dall'array)e lo restituisce alla fine del metodo, se non trova una corrispondenza, allora restituisce null. 
scambiaTarga--> prende come parametri in input due interi che rappresentano le posizioni dei due autoarticolati a cui verranno scambiate le targhe; se tale scambio avviene correttamente allora il metodo deve restituire true, in caso contrario restituisce false.
stampaAutoarticolati--> stampa per ogni riga ogni autoarticolato presente nella rivendita con tutte le informazioni che lo caratterizzano.

Nel main creare 1 oggetto Rivenditore e 5 oggetti Autoarticolato a piacimento ma con targhe diverse ed inserirli nella Rivendita(cioè nell'array del rivenditore). 
Aggiungere 2 ruote al trattore stradale dell'ultimo Autoarticolato dell'array, scambiare la targa del secondo con il terzo. 
Stampare alla fine tutte le informazioni utilizzando il metodo appositamente creato.
Infine interagire con l'utente chiedendo se vuole comprare uno dei 5 Autoarticolati esposti, specificando la targa eventualmente.
In caso di risposta affermativa, utilizzando il metodo corretto, vendere l'Autoarticolato scelto.*/
public class Autoarticolato extends Trattore_Stradale{
	int peso_rimorchio;
	int lunghezza_totale;
	public int getPeso_rimorchio() {
		return peso_rimorchio;
	}
	public void setPeso_rimorchio(int peso_rimorchio) {
		this.peso_rimorchio = peso_rimorchio;
	}
	public int getLunghezza_totale() {
		return lunghezza_totale;
	}
	public void setLunghezza_totale(int lunghezza_totale) {
		this.lunghezza_totale = lunghezza_totale;
	}
	
	public int getPeso() {
		int peso_complessivo = this.peso_rimorchio+super.peso;
		return peso_complessivo;
	}
	public Autoarticolato(int peso, String targa, int peso_rimorchio, int lunghezza_totale) {
		super(peso,targa);
		this.lunghezza_totale = lunghezza_totale;
		this.peso_rimorchio = peso_rimorchio;
			}
	
}
