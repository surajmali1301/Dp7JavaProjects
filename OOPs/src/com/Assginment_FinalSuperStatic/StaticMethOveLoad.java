package com.Assginment_FinalSuperStatic;

class StaticMethodOverloading {

    // Static method with one int parameter
    public static void print(int num) {
        System.out.println("Static method with one int parameter: " + num);
    }

    // Static method with one double parameter
    public static void print(double num) {
        System.out.println("Static method with one double parameter: " + num);
    }

    // Static method with two int parameters
    public static void print(int num1, int num2) {
        System.out.println("Static method with two int parameters: " + num1 + ", " + num2);
    }

}

public class StaticMethOveLoad {

	public static void main(String[] args) {
		StaticMethodOverloading.print(10);           // Calls the first static method
		StaticMethodOverloading.print(10.0);         // Calls the second static method
		StaticMethodOverloading.print(20, 30);       // Calls the third static method
	}
}