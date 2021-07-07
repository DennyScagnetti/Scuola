package java;
//Caratteristiche del linguaggio orientato ad oggetti
//INCAPSULAMENTO -> acquisizione degli attributi(stati) e metodi(caratteristiche) dell'istanza dell'oggetto dalla classe di appartenenza
//POLIMORFISMO -> si possono dichiarare metodi con lo stesso nome all'interno della classe purchè abbiano parametri di numero diverso o di tipo diverso o in ordine diverso
public class Frazione {

	//attributi
	private int numeratore;
	private int denominatore;
	
	//metodi get
	int getNumeratore(){
		return this.numeratore;
	}
	
	int getDenominatore(){
		return this.denominatore;
	}
	
	//metodi set
	void setNumeratore(int n) {
		numeratore = n;
	}
	
	void setDenominatore(int d) {
		this.denominatore = d;
	}
	
	
	private double CalcolaFrazione() {
		double soluzione =  (double) this.numeratore /  (double) this.denominatore;
		return soluzione;
	}
	
	void StampaSoluzione() {
		System.out.println("La soluzione è "+ CalcolaFrazione() );
	}
	
	//costruttore 
	Frazione(){
	}
	
	Frazione(int num, int den){
		this.numeratore = num;
		this.denominatore = den;
	}
	Frazione(int num){
		this.numeratore = num;
	}
	
	Frazione(double num){
		this.numeratore = (int) num;
	}
	
	Frazione(double den, int num){
		this.denominatore =(int) den;
		this.numeratore = num;
	}
	
	Frazione(int num, double den){
		this.denominatore =(int) den;
		this.numeratore = num;
	}
	
	public static void main(String[] args) {
		
		Frazione F = new Frazione();		//creazione istanza oggetto F di tipo Frazione
		F.setNumeratore(5);
		F.setDenominatore(6);
		
		Frazione F1 = new Frazione(5,6);
		
		Frazione F2 = new Frazione (5);
		F2.setDenominatore(6);
		
		double den= 6.00;
		Frazione F3 = new Frazione (5, den);
		
		Frazione F4 = new Frazione (den, 5);
		
		Frazione F5 = new Frazione();
		F5.setNumeratore(9);
		F5.setDenominatore(5);
		F5.StampaSoluzione();
		
		Frazione FArray[] = new Frazione[10];
		FArray[0] = F;
		FArray[1] = F1;
		FArray[2] = new Frazione(10,0);
		FArray[3] = F2;
		FArray[4] = F3;
		FArray[5] = F4;
		FArray[6] = F5;
		
		
		for(int i=0; i<FArray.length; i++) {
			if(FArray[i].getDenominatore() == 0) {
				System.out.print("ERRORE nell'istanza n° "+ i);
			}
		}
		}
	


}
