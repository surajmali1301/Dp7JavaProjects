package com.Assginment_FinalSuperStatic;

class Parent2 {
	public static void staticMethod() {
		System.out.println("Parent class static method");
	}
}

class ChildClass3 extends Parent2 {
	public static void staticMethod() {
		System.out.println("Child class static method");
	}
}

public class StaticOverride {
	public static void main(String[] args) {
		Parent2.staticMethod(); // Calls the static method in ParentClass
		ChildClass3.staticMethod(); // Calls the static method in ChildClass
	}

}
