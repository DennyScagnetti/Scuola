package java;

/*Pag. 51 n°43 -> Un'urna contiene venti palline numerate da 1 a 20. Creare un programma che simuli un'estrazione casuale dall'urna e che 
 * consideri come vittoria l'estrazione di due numeri pari.
 */
public class Lotto {

	public static void main(String[] args) {
		
		//Se si estrae un numero solo
		int numero_estratto;
		
			numero_estratto = (int) (Math.random()*20+1);//1 20  20-1=19+1 = 20
			//numero_estratto = (int) (Math.random()*18+3); //3 20   20-3=17+1 = 18
			//numero_estratto = (int) (Math.random()*11+(-2)); //-2 8    8-(-2) = 10+1  = 11
			System.out.println(numero_estratto);
		if(numero_estratto%2 ==0) {
			System.out.println("HAI VINTO!!");
		}
		//FINE PROGRAMMA
		
		//Se si estraggono 6 numeri
		int estrazione[] = new int[6];
		int i, contatore=0;
		//caricamento vettore
		System.out.println("I numeri estratti sono: ");
		for(i=0; i<estrazione.length; i++) {
			estrazione[i] = (int) (Math.random()*20 +1); 
			System.out.print(estrazione[i]+" ");
		}
		
		//analisi vettore
		for(i=0; i<estrazione.length; i++) {
			
			if(estrazione[i]%2 == 0) {
				contatore++;
				System.out.println("E' uscito il numero \n"+ estrazione[i]);
				
			}
			if(contatore == 2) {
				System.out.print("Hai vinto!!!!");
				break;
			}
		}
	}

}
