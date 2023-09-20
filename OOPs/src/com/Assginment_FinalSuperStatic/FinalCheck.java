package com.Assginment_FinalSuperStatic;

class FinalVar {

	final int finalVariable;

	// Default constructor
	public FinalVar() {
		this.finalVariable = 10;
	}

	// Parameterized constructor
	public FinalVar(int value) {
		this.finalVariable = value;
	}

	// Instance method
	public void printFinalVariable() {
		System.out.println("Final Variable Value: " + finalVariable);
	}

	// Static method
	public static void staticMethod() {
		System.out.println("Static Method");
	}

}

public class FinalCheck {

	public static void main(String[] args) {
		FinalVar obj1 = new FinalVar();
		obj1.printFinalVariable(); // Output: Final Variable Value: 10

		FinalVar obj2 = new FinalVar(20);
		obj2.printFinalVariable(); // Output: Final Variable Value: 20

		FinalVar.staticMethod(); // Output: Static Method

	}

}
