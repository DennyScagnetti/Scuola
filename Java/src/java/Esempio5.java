package java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Esempio5 {

String nome_file ;
	

	public void Read() {
		try {
		FileInputStream f = new FileInputStream(nome_file);
		ObjectInputStream fIN = new ObjectInputStream(f);
		
		System.out.print(fIN.readObject());
		f.close();
		}
		catch(Exception e) {
			System.out.println("Errore read file");
		}
	}
	
	
	public void Write(Object O) {
		
		try {
			FileOutputStream f = new FileOutputStream(nome_file);
			ObjectOutputStream fOUT = new ObjectOutputStream(f);
			
			fOUT.writeObject(O);
			System.out.println(O);
			fOUT.flush();
			f.close();
			}
			catch(Exception e) {
				System.out.println("Errore write file");
			}
	}
	
	//costruttore
	public Esempio5(String nome_file) {
		this.nome_file = nome_file;
	}
	
	public static void main(String[] args) {
		
	}

}
