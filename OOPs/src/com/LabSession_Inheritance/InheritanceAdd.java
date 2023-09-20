package com.LabSession_Inheritance;

class A {
	int x = 20;
	int y = 80;

}

class B extends A {

	int x = 30;
	int y = 80;

	void display() {
		System.out.println("child class x: "+x);
		System.out.println("child class y: "+y);
		System.out.println("Super class x: "+super.x);
		System.out.println("Super class y: "+super.y);
		System.out.println("Addition of child & Parent class: "+(x+super.x));
		System.out.println("Addition of child & Parent class: "+(x+super.x));
	}
}

public class InheritanceAdd {

	public static void main(String[] args) {

		B b = new B();

		b.display();
	}
}
