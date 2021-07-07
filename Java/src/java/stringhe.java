package java;

public class stringhe {
	//attributi
	private String str1, str2;
	
	//metodi
	boolean confronto() {
		if(str1.equals(str2))//if(str1.compareTo(str2)== 0)    //if(str1 == str2)// 
			return true;
		else return false;
	}
	
	boolean contiene() {
		if(str1.contains(str2))
			return true;
		else return false;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
