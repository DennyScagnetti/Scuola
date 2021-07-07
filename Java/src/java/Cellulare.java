package java;
import java.io.*;
public class Cellulare extends Libro{
	private float credito;
	private int numeroChiamate;
	
	public void setCredito(float credito) {
		this.credito = credito;
	}
	
	public float getCredito() {
		return credito;
	}
	
	public void setnumeroChiamate(int numeroChiamate) {
		this.numeroChiamate = numeroChiamate;
	}
	
	public int getnumeroChiamate() {
		return numeroChiamate;
	}
	//costruttore
	public Cellulare(int numeroChiamate, float credito, int prezzo, String T, String A) {
		super(prezzo, T, A);
		this.numeroChiamate = numeroChiamate;
		this.credito = credito;
	}
	public static void main(String[] args) {
		//oggetto C
		Cellulare C = new Cellulare(0, 20,30, "Il rosso", "Marco");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		try {
			String prova = tastiera.readLine();
		}
		catch(Exception e) {
			System.out.print("Errore");
		}
	}

}
