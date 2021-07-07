package java;

public class Triangolo_Isoscele {

		//attributi
		private double base;
		private double altezza;
		private double lato_obliquo;
		
		//metodi
		
		double getAltezza() {
			return altezza;
		}
		
		double getBase() {
			return base;
		}
		
		void setBase(double b) {
			base=b;
		}
		void setAltezza(double a) {
			altezza=a;
		}
		
		double lato_obliquo() {
			double lato_ob=Math.sqrt(((base/2)*(base/2)) + ((altezza/2)*(altezza/2)));//oppure Math.sqrt(Math.pow(base/2, 2) + Math.pow(altezza, 2)
			return lato_ob;
		}
		
		
		double area() {
			double area=base*altezza/2;
			return area;
		}
		
		double perimetro() {
			double perimetro=lato_obliquo*2+base;
			return perimetro;
		}

		public static void main(String[] args) {
			
			//Creazione del primo triangolo isoscele
			Triangolo_Isoscele TI1 = new Triangolo_Isoscele();
			TI1.setBase(3.4);//TI1 ha base 3.4
			TI1.setAltezza(2.1);//TI1 ha altezza 2.1
			System.out.println("Il perimetro di TI1 è " + TI1.perimetro());
			System.out.println("L'area di TI1 è "+ TI1.area());
	
			
			//Creazione del secondo triangolo isoscele
			Triangolo_Isoscele TI2 = new Triangolo_Isoscele();
			TI2.setBase(3.4);//TI1 ha base 3.4
			TI2.setAltezza(2.1);//TI1 ha altezza 2.1
			System.out.println("Il perimetro di TI1 è " + TI2.perimetro());
			System.out.println("L'area di TI1 è "+ TI2.area());

			
			//Creazione del terzo triangolo isoscele
			Triangolo_Isoscele TI3 = new Triangolo_Isoscele();
			TI3.setBase(3.4);//TI1 ha base 3.4
			TI3.setAltezza(2.1);//TI1 ha altezza 2.1
			System.out.println("Il perimetro di TI1 è " + TI3.perimetro());
			System.out.println("L'area di TI1 è "+ TI3.area());

		

	}

}
