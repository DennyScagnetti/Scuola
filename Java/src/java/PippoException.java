package java;

public class PippoException extends Exception{
	String error;
	void printError(){
		System.out.print(error);
	}
PippoException(String a){
	this.error = a;
}
}
