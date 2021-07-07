package java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *Dopo aver acquisito da tastiera un array di 10 numeri a singola precisione, sommare le sue componenti e visualizzare il risultato*/
public class Pag50_n29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vett[] = new int [10];
		int i, somma=0;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		//caricamento vettore
		System.out.println("Riempi il vettore con 10 interi");

		for(i=0; i<=vett.length; i++) {
		try {
			String prova = tastiera.readLine();
			vett[i] = Integer.valueOf(prova).intValue();
			
		}
		catch(Exception e) {
			System.out.println("Non hai inserito un intero!");
		}
		}
		
		//somma elementi del vettore
		
		for(i=0; i<vett.length; i++) {
			somma = somma+ vett[i];
			//somma += vett[i];
		}
		System.out.print("La somma degli elementi del vettore è "+ somma);
	}

	
	
	/*
	 * int rand = (int) (Math.random()*10);
		int rand1 = (int) ((Math.random()*10) + 10);
		System.out.println(rand +" "+ rand1);
	 * 
	 * */
}
