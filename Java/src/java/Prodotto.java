package java;

import java.io.*;
public class Prodotto implements Serializable{

	String descrizione;
	int numero_reparto;
	double prezzo;
	
	public Prodotto(String descrizione,	int numero_reparto,	double prezzo) {
		this.descrizione = descrizione;
		this.numero_reparto = numero_reparto;
		this.prezzo = prezzo;
	}
}

