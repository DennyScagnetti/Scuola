package java;
/*
 * Scrivi un programma che disegna sullo schermo 3 cornici quadrate concentriche costituite dal carattere '*' rispettivamente di lato 12, 8 e 4*/
public class Cornici {

	public static void main(String[] args) {
		char asterisco = '*';
		int i=0, j=0;
/*
 * * * * * * * * * * * *
 * 	                   *
 *   * * * * * * * *   *
 *   *             *   *
 *   *   * * * *   *   *
 *   *   *     *   *   *
 *   *   *     *   *   *
 *   *   * * * *   *   *
 *   *			   *   *
 *   * * * * * * * *   *
 *                     *
 * * * * * * * * * * * * 
 */
		for(j=0; j<12; j++) {
			
		
			//j=0 0-i-11  j=2  2-i-9   j=4  4-i-7  
			if(j%2==0 && j<6) {
				for(i=0; i<j; i++) {
					System.out.print("  ");
				}
				for(i=j; i<12-j; i++) {
					System.out.print(asterisco +" ");
				}
				for(i=12-j; i<12; i++) {
					System.out.print("  ");
				}
			}
			
			//j=7 4-i-7  j=9  2-i-9  j=11  0-i-11
			else if(j%2==1 && j>6) {
				for(i=0; i<11-j; i++) {
					System.out.print("  ");
				}
				for(i=11-j; i<j+1; i++) {
					System.out.print(asterisco +" ");
				}
				for(i=j+1; i<12; i++) {
					System.out.print("  ");
				}
			}
		
			//i=0, i=12, (j>2 && j<10) i=2, i=10    (j>4 && j<8) i=4, i=8
			else {
				
				
			}
			System.out.println();
		}
	}
}


