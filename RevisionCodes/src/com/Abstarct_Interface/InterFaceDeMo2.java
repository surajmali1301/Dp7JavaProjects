package com.Abstarct_Interface;

interface A1{
	void show();
}

interface A2{
	void show();
}

class A implements A1,A2{
	
	public void show() {
		System.out.println("Class Show Method");
	}
}

public class InterFaceDeMo2 {

	public static void main(String[] args) {

		A a;
		a = new A();
		a.show();

	}

}
