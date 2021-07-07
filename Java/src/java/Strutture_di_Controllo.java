package java;
import java.io.*;
public class Strutture_di_Controllo {

	
	
	public static void main(String[] args) {
		/*int a=0;
		int b= 0;
		//la selezione
		if(a != b) {
			System.out.println("a è diverso da b");
		}
		else {
			//quando la condizione è falsa
		}
		if(a == b) {
			System.out.println("a è uguale da b");
		}
		int i;
		//ciclo for
		for(i=0; i<19;i++) {
			a=a+1;
			System.out.print(a +" ");
		}
		System.out.println();
		//ciclo while
		while(b<19) {
			System.out.print(b +" ");
			
			b++;
		}
		*/
		
		//PAG.49 N° 12
		/* Scrivere un programma che legge da tastiera la misura del lato e calcola l'area e il perimetro 
		 * di un quadrato
		*/
		
		
		int lato = 0;
		int perimetro, area;
		System.out.println("Inserisci il lato del quadrato");
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		
		try {
			String prova = tastiera.readLine();
			lato = Integer.valueOf(prova).intValue();
		}
		catch(Exception e) {
			System.out.println("ERROREEE");
		}
		
		
		perimetro = lato*4;
		area = lato*lato;
		if(lato!=0) {
		System.out.println("Il perimetro del quadrato è " + perimetro);
		System.out.print("Il area del quadrato è " + area);
		}
		else {
			System.out.print("Non è possibile calcolare l'area e il perimetro del quadrato");
		}
		
		
	}

}
