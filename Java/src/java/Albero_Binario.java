package java;

public class Albero_Binario {

	Object O; //informazione
	
	Albero_Binario sinistro;
	Albero_Binario destro;
	boolean radice;
	public Albero_Binario(Object O, Albero_Binario s, Albero_Binario d, boolean radice) {
		this.O = O;
		this.destro = d;
		this.sinistro = s;
		this.radice=radice;
	}
	public Albero_Binario(Object O, boolean radice) {
		this.O = O;
		this.destro = null;
		this.sinistro = null;
		this.radice = radice;
	}
	
	
	public static void main(String []args) {
		Albero_Binario AB= new Albero_Binario("O",true);
		
		Albero_Binario AB1 = new Albero_Binario("A",false);
		AB.sinistro = AB1;
		Albero_Binario AB2 = new Albero_Binario("F",false);
		AB.destro = AB2;
		
		Albero_Binario AB3 = new Albero_Binario("I",false);
		AB1.sinistro = AB3;
		Albero_Binario AB4 = new Albero_Binario("K",false);
		AB1.destro = AB4;
		Albero_Binario AB5 = new Albero_Binario("D",false);
		AB2.sinistro = AB5;
		Albero_Binario AB6 = new Albero_Binario("Q",false);
		AB2.destro = AB6;
		
		
		
	}
	
}
