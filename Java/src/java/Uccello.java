package java;

public class Uccello extends Ali{
	String nome, stato1;
	
	//creare un costruttore parametrizzato, di default gli uccelli sono a terra.
	public Uccello(String nome, String colore, double lunghezza) {
		super(colore, lunghezza);
		this.nome = nome;
		this.stato1 = "a terra";
	}

	//overriding cambiaStato() che modifica lo stato da "a terra" a "in volo" se cambia lo stato delle ali da chiuso ad aperto
	public String cambiaStato() {
		if(super.stato.equals("aperte")) {
			stato1 = "in volo";
		} else if (super.stato.equals("chiuse")) {
			stato1 = "a terra";
		}
		return stato;
	}
	
	//set e get degli attributi
	public void setNome(String N) {
		this.nome = N;
	}
	public void setStato1(String S) {
		this.stato = S;
	}
	
	public String getNome() {
		return nome;
	}
	public String getStato1() {
		return stato;
	}
	

	
}
