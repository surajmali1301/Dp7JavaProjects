package com.StaticFinal_Assignment;

class Example {
    final int finalVar; // Final variable without initialization

    // Default constructor
    public Example() {
        this.finalVar = 0; // Initialize finalVar in the default constructor
    }

    // Parameterized constructor
    public Example(int value) {
        this.finalVar = value; // Initialize finalVar in the parameterized constructor
    }

    // Instance method
    public void printFinalVar() {
        System.out.println("Final variable value: " + this.finalVar);
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}


public class ConstStatic {

	public static void main(String[] args) {
		Example obj1 = new Example();
		Example obj2 = new Example(42);
		
		obj1.printFinalVar(); // Output: Final variable value: 0
		obj2.printFinalVar(); // Output: Final variable value: 42
		
		Example.staticMethod(); // Output: This is a static method.
	}
}
