package com.StaticFinal_Assignment;

class Base {
 final void display() {
     System.out.println("Final method in Base class");
 }
}

class Derived extends Base {
 // void display() { // compile time error as display() is final
 //     System.out.println("Attempting to override final method");
 // }
}

public class UseOfFinal {
	
	    final int value = 100;

	    public static void main(String[] args) {
	    	UseOfFinal obj = new UseOfFinal();
	        System.out.println(obj.value); // Output: 100
	        Base obj1 = new Base();
	        obj1.display();
	    }
	}


