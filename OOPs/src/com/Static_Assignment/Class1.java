package com.Static_Assignment;

public class Class1 {
	static int staticVar = 10;
	int instanceVar = 20;

	public static void main(String[] args) {
		System.out.println("Static Variable: " + staticVar);
		Class1 obj = new Class1();
		System.out.println("Instance Variable: " + obj.instanceVar);
	}
}
