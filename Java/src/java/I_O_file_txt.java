package java;

import java.io.*;

//pag.173-179
public class I_O_file_txt {

	String nome_file;
	
	public void lettura() {
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
			System.out.println("Errore lettura");
		}
	}
	
	public void scrittura() {
		try {
		FileWriter f = new FileWriter(nome_file);
		PrintWriter fOUT = new PrintWriter(f);
		String riga;
		for(int i=0; i<7;i++) {
			riga = "riga "+ i;
			fOUT.println(riga);
		}
		fOUT.flush();
		f.close();
		}
		catch(Exception e) {
			System.out.println("Errore scrittura");
		}
		
	}
	
	public void scrittura(String riga) {
		try {
		FileWriter f = new FileWriter(nome_file);
		PrintWriter fOUT = new PrintWriter(f);
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		for(int i=0; i<7;i++) {
			System.out.println("Inserisci riga da scrivere ");
			riga = tastiera.readLine();
			fOUT.println(riga);
		}
		fOUT.flush();
		f.close();
		}
		catch(Exception e) {
			System.out.println("Errore scrittura");
		}
		
	}
	public I_O_file_txt(String nome_file) {
		this.nome_file = nome_file;
	}
	public static void main(String[] args) {
	
		I_O_file_txt T = new I_O_file_txt("righe.txt");
		T.scrittura();
		T.lettura();
		T.scrittura("prova");
	}

}
