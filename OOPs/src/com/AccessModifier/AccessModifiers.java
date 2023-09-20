package com.AccessModifier;

public class AccessModifiers {

	private int a;
	int b;
	public int c;

	private void show() {
		System.out.println("Showing.....");
	}

	void display1() {
		System.out.println("Displaying 1st screen ");
	}

	public void diplay2() {
		System.out.println("Displaying 2nd screen ");
	}

	public static void main(String[] args) {

		AccessModifiers am = new AccessModifiers();
		
		am.a=10;
		am.b=20;
		am.c=30;
		
		am.show();
		am.display1();
		am.diplay2();
	}

}
