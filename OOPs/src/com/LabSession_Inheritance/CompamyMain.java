package com.LabSession_Inheritance;


class Company{
	void address() {
		System.out.println("Japan");
	}
}
class Ebay extends Company{
	
	void address() {
		System.out.println("Tokyo");
	}
	void show() {
		System.out.println("Ebay");
	}
}
public class CompamyMain {

	public static void main(String[] args) {


//		Company e = new Ebay();
		Company c;
		c = new Company();
		c.address();
		System.out.println("----------------------");
		c = new Ebay();
		c.address();
//		c.show();
		
		
	}

}
