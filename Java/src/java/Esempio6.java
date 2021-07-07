package java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Esempio6 {

String nome_file;
	
	public void Read() {
		try {
		FileReader f = new FileReader(nome_file);
		BufferedReader fIN = new BufferedReader(f);
		int cont=0;
		String riga;
		for(int i=0; i<7;i++) {
		riga= fIN.readLine();
		//System.out.println(riga);
		riga = riga.replace('a', 'o');
		//System.out.println(riga);
		}
		f.close();
		}
		catch(Exception e) {
			System.out.println("Errore Read");
		}
	}
		
	public Esempio6(String nome_file) {
		this.nome_file = nome_file;
	}
}
