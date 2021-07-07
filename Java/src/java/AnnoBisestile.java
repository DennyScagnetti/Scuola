package java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Pag.51 n°42 -> Un anno è bisestile se è divisibile per 4 e non è divisibile per 100. Sono però bisestili anche gli anni divisibili per 400.
 * Scrivere un programma che, inserendo un anno da tastiera, risponda se è un anno bisestile o no. 
 */
public class AnnoBisestile {

	public static void main(String[] args) {
		int anno=0;
		System.out.println("Insersci un anno ");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		try {
			String prova = tastiera.readLine();
			anno = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.println("Errore");
		}
		
		if( ((anno%4 == 0) && (anno%100 != 0))  || (anno%400 == 0))  {
			System.out.print("L'anno "+ anno + " è bisestile");
		}
		else {
			System.out.print("L'anno "+ anno + " non è bisestile");
		}
	}

}
