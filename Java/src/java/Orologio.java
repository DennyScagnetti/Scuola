package java;
/*Pag. 128 n°17 -> Definire la classe oggetto Orologio che registra le ore e i minuti. 
 * Definire 3 costruttori: il primo per inizializzare l'orologio a un'ora di default, 
 * il secondo per inizializzare solo le ore, il terzo per richiedere sia le ore che i minuti
 * */
public class Orologio {
	//attributi
	int ore;
	int minuti;
	
	//metodi
	int getOre(){
		return ore;
	}
	
	int getMinuti(){
		return minuti;
	}
	
	void setOre(int o) {
		this.ore = o;
	}
	
	void setMinuti(int m) {
		this.minuti = m;
	}
	
	void AumentaOra() {
		this.ore = this.ore+1;
	}
	
	void DiminuisciOra() {
		this.ore = this.ore-1;
	}
	
	void AumentaMinuti() {
		this.minuti = this.minuti+1;
	}
	
	void DiminuisciMinuti() {
		this.minuti = this.minuti-1;
	}
	
	Orologio(){
		this.ore = 0;
		this.minuti = 0;
	}
	
	Orologio(int minuti){
		this.ore=0;
		this.minuti = minuti;
	}
	
	Orologio(int minuti, int ore){
		this.ore= ore;
		this.minuti = minuti;
	}
	public static void main(String[] args) {
		Orologio O1 = new Orologio();
		Orologio O2 = new Orologio(5);
		Orologio O3 = new Orologio(11,30);
		O3.AumentaMinuti();
		O3.AumentaMinuti();
		O3.AumentaMinuti();
	}

}
