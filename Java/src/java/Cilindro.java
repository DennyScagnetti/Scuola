package java;
//java.awt java.swing java.io java.lang java.util
//pag.115

public class Cilindro extends Cerchio{
private static int altezza;
private int raggio;
public static final double PG = 3.14;

void setAltezza(int a) {
	altezza = a;
}
void setRaggio(int r) {
	raggio = r;
}
int getAltezza() {
	return altezza;
}
int getRaggio() {
	return raggio;
}
public static double getPG() {
	return PG;
}
double area() {
//	double area = (raggio*raggio*3.14*2) + (raggio*2*3.14*altezza);
	Cerchio C = new Cerchio();
	C.setRaggio(raggio);
	double area = (C.area()*2) + (C.circonferenza()*altezza);
	return area;
}
	public static void main(String[] args) {
		Cilindro Cil = new Cilindro();
		Cil.setRaggio(6);
		System.out.println("L'area di Cil è "+ Cil.area());
		System.out.println(Cilindro.getPG());
		//String s = "";
		String s = new String("parola");
		System.out.println(s.length());
		//s.toUpperCase();
		System.out.print(s.toUpperCase());
		s.lastIndexOf("ro", 1);
	}
	

}
