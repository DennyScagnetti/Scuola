package java;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int vettore[];//vettore o array monodimensionale
vettore = new int [15];
vettore [0] = 2;
int i=0,j=0, k, l, m;
for(i=1; i<vettore.length; i++) {
	vettore[i] = vettore[i-1]+2; 
	//vettore[i+1] = vettore[i]+2;
}

int matrice[][] = new int [6][6];//matrice o array multidimensionale
System.out.print("Lung matr "+ matrice.length);
for(i=0; i<matrice.length; i++) {
	for(j=0; j<matrice.length; j++) {
		matrice[i][j]= (int) (Math.random()*100);
	}
	
}
int indice1=5, indice2=2, indice3=6, indice4=9, indice5=2;
int array [][][][][] = new int [indice1][indice2][indice3][indice4][indice5];
	
for(i=0; i<indice1; i++) {
	for(j=0; j<indice2; j++) {
		for(k=0; k<indice3; k++) {
			for(l=0; l<indice4; l++) {
				for(m=0; m<indice5; m++) {
					array [i][j][k][l][m] = (int) (Math.random()*100);
				}
			}
		}
	}
}
	}
}
