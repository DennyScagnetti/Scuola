package java;

public class Ordine {

	String nome_bevanda;
	String nome_spuntino;
	
	public Ordine(String nome_bevanda, String nome_spuntino) {
		this.nome_bevanda = nome_bevanda;
		this.nome_spuntino = nome_spuntino;
	}
	public Ordine(String nome_bevanda) {
		this.nome_bevanda = nome_bevanda;
		this.nome_spuntino = "";
	}
	public Ordine(String nome_spuntino, boolean b) {
		this.nome_bevanda = "";
		this.nome_spuntino = nome_spuntino;
	}
}
