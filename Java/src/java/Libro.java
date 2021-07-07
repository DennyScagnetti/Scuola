package java;

public class Libro {
int prezzo;
String titolo;
String autore;
public int getPrezzo() {
	return prezzo;
}
public void setPrezzo(int prezzo) {
	this.prezzo = prezzo;
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}
public String getAutore() {
	return autore;
}
public void setAutore(String autore) {
	this.autore = autore;
}

Libro(int prezzo, String titolo, String autore){
this.prezzo = prezzo;
this.titolo = titolo;
this.autore = autore;
}
}
