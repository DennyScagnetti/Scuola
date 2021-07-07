package java;
/* Dati due numeri interi compresi tra 0 e 49 generati casualmente, visualizzare il numero 
 * più grande*/
public class Pag51_n35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = (int) (Math.random()*49);
		int numero2 = (int) (Math.random()*49);
		System.out.println("I numeri casuali sono "+numero1 +" "+numero2);
		System.out.print("Il numero casuale più grande è ");
		if(numero1 > numero2) {
			System.out.print(numero1);
		}
		else if(numero1 == numero2) {
				System.out.print("Sono uguali!!");
		}
		else {
				System.out.print(numero2);
		}
	
	}
}
