package java;

import java.io.*;

public class TogliVirgole {

	
	public static void main(String[] args) {
		try {
			String riga="";
		FileReader f = new FileReader("Verifica_di_recupero.txt");
		BufferedReader fIN = new BufferedReader(f);
		FileWriter f1 = new FileWriter("Verifica_di_recupero1.txt");
		PrintWriter fOUT = new PrintWriter(f1);
		for(int i=0; i<21; i++) {
			 riga = fIN.readLine();
			riga=  riga.replace(',', '\t');
			System.out.println(riga);
			fOUT.write(riga+"\n");
			
			
		}
		fOUT.flush();
		f.close();
			f1.close();
		
		}
		catch(Exception e) {
			System.out.print("Errore");
		}
	}

}
