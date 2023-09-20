package com.Assginment_FinalSuperStatic;

class ParentClass {
	int parentVariable = 10;

	void parentMethod() {
		System.out.println("This is a method in the parent class");
	}
}

class ChildClass extends ParentClass {
	int childVariable = 20;

	void childMethod() {
		int childVariable = 30; // Shadowing the instance variable

		System.out.println("Child Variable (local): " + childVariable);
		System.out.println("Child Variable (instance): " + this.childVariable);
		System.out.println("Parent Variable: " + super.parentVariable);

		this.parentMethod(); // Calling parentMethod using 'this'
		super.parentMethod(); // Calling parentMethod using 'super'
	}
}

public class SuperUse {

	public static void main(String[] args) {
		ChildClass childObj = new ChildClass();
		childObj.childMethod();
	}
}
