package com.Static_Assignment;
/*non static variable in non-static method */

public class Class5 {
	int instanceVar = 20;

	public void nonStaticMethod() {
		System.out.println("Instance Variable in Non-Static Method: " + instanceVar);
	}

	public static void main(String[] args) {
		Class5 obj = new Class5();
		obj.nonStaticMethod();
	}
}
