package java;

public class Array {

	public static void main(String[] args) {
		
		int a = 7;
		int vett[] = new int[a];
		vett[0]= 2; // primo elemento
		vett[1]= 5; // secondo elemento
		
		int vett1[] = {2, 5, 6, 0, 8, 4}; // definizione e inizializzazione esplicita
		int i;
		for(i=0; i<vett.length; i++) {
			int c = i+1;
			vett[i] = c;
		}
		/*ECCEZIONI 
		 * IOException	-> eccezione gestione Input/Output
		 * Exception  -> eccezione generica
		 * IndexOutOfBoundException	-> eccezione indice array fuori dimensione
		 * ArithmeticException	-> eccezione calcolo aritmetico
		 * */
		
		double matrice[][] = new double[19][10];
		String cubo[][][]  = new String[2][3][5];
		
		
	}
}
