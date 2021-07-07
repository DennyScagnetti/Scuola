package java;

public class Lista_concatenata {

	//attributi
	Object O;
	Lista_concatenata L;
	boolean testa;
	
	public Lista_concatenata(Object o, Lista_concatenata L, boolean testa) {
		this.O = o;
		this.L = L;
		this.testa = testa;
	}
	public Lista_concatenata(Object o) {
		this.O = o;
		this.L = null;
		this.testa = false;
	}
	
	public void inserisci(Object o) {
		/*this.L.O = o;
		this.L.L = null;*/
		Lista_concatenata L1 = new Lista_concatenata(o);
		L = L1;
	}
	
	public Object elimina() {
		Object o = this.O;
		this.O = null;
		this.L = null;
		return o;
	}
	
	public void concatena_lista(Lista_concatenata L1) {
		while(L.L != null) {
			L = L.L;
		}
		L.L = L1;
	}
	
	public static void concatena_liste(Lista_concatenata L1, Lista_concatenata L2) {
		while(L1.L != null) {
			L1 = L1.L;
		}
		L1.L = L2;
	}
	public Object contiene() {
		return this.O;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0, b= 6, c= 10, d=16, e=22;
		Lista_concatenata L4 = null;
		
		Lista_concatenata L2 = new Lista_concatenata(a, null, true);
		Lista_concatenata L3 = new Lista_concatenata(b);
		Lista_concatenata L5 = new Lista_concatenata(c);
		Lista_concatenata L7 = new Lista_concatenata(e);
		L2.L = L3;
		L3.L = L5;
		Lista_concatenata L6 = new Lista_concatenata(d,L7,true);
		L2.concatena_lista(L6);
		concatena_liste(L2,L6);
		System.out.println("Lista : ");
	
		while(L2.L != null) {
			
			if((int) L2.O == 6 && L2.L == null)
				L2.elimina();
			else {L4 = L2.L;
			L2.O = null;}
			}
		System.out.println(L2.O);
			L4 = L2;
			L2	= L2.L;
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

