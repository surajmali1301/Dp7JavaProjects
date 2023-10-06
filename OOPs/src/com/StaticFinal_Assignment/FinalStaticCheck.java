package com.StaticFinal_Assignment;

class Final {
    final static int var; // Final static variable without initialization

    // Static block to initialize final_static_var
    static {
        var = 100; // Initialize final_static_var in a static block
    }

    final int var1; // Final instance variable

    // Default constructor
    public Final() {
        this.var1 = 0;
    }

    // Parameterized constructor
    public Final(int value) {
        this.var1 = value;
    }

    // Instance method
    public void print_final_var() {
        System.out.println("Final variable value: " + this.var1);
    }

    // Static method
    public static void static_method() {
        System.out.println("This is a static method.");
    }
}



public class FinalStaticCheck {

	public static void main(String[] args) {
		Final obj1 = new Final();
		Final obj2 = new Final(42);
		
		obj1.print_final_var(); // Output: Final variable value: 0
		obj2.print_final_var(); // Output: Final variable value: 42
		
		Final.static_method(); // Output: This is a static method.
		System.out.println("Final static variable value: " + Final.var); // Output: Final static variable value: 100
	}
}
