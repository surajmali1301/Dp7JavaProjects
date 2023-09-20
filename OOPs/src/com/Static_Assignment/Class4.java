package com.Static_Assignment;
/*then static variable in non-static method*/

public class Class4 {
	static int staticVar = 10;

	public void nonStaticMethod() {
		System.out.println("Static Variable in Non-Static Method: " + staticVar);
	}

	public static void main(String[] args) {
		Class4 obj = new Class4();
		obj.nonStaticMethod();
	}
}
