package java;

import java.io.*;
//pag. 168-172 scrittura e lettura di un oggetto in un file .dat
public class I_O_file_dat {

	String nome_file;
	

	public void lettura() {
		try {
		FileInputStream f = new FileInputStream(nome_file);
		ObjectInputStream fIN = new ObjectInputStream(f);
		System.out.print("Leggo ");
		System.out.print(fIN.readObject());
		f.close();
		}
		catch(Exception e) {
			System.out.println("Errore lettura file .dat");
		}
	}
	
	
	public void scrittura(Object O) {
		
		try {
			FileOutputStream f = new FileOutputStream(nome_file);
			ObjectOutputStream fOUT = new ObjectOutputStream(f);
			
			fOUT.writeObject(O);
			System.out.println("Scrivo "+ O);
			
			fOUT.flush();
			f.close();
			}
			catch(Exception e) {
				System.out.println("Errore scrittura file .dat");
			}
	}
	
	//costruttore
	public I_O_file_dat(String nome_file) {
		this.nome_file = nome_file;
	}
	
	public static void main(String[] args) {
		//String spesa = "pasta";
		Ali A = new Ali("bianche",6);
		I_O_file_dat I = new I_O_file_dat("dat_prova.dat");
		I.scrittura("");
		I.lettura();
		
	}

}
