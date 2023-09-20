package com.StaticKeyword;

public class StaticVariableDemo {

	int x = 10;
	static int y=20;
	
	void instanceMethod() {
		System.out.println(x);
		System.out.println(y);
		
	}
	
	static void staticMethod() {
		System.out.println("y: "+y);
	}
	public static void main(String[] args) {


		StaticVariableDemo s1 = new StaticVariableDemo();
		
		s1.instanceMethod();
		staticMethod();

	}

}
