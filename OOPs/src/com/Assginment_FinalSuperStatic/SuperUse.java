package com.Assginment_FinalSuperStatic;

class ParentClass {
	int parentVariable = 10;

	public ParentClass() {
	}

	public ParentClass(int parentVariable) {
		this.parentVariable = parentVariable;
	}

	void parentMethod() {
		System.out.println("This is a method in the parent class");
	}
}

class ChildClass extends ParentClass {
	int childVariable = 20;

	public ChildClass() {

	}

	public ChildClass(int parentVariable, int childVariable) {
		super(parentVariable);// 1
		this.childVariable = childVariable;
	}

	void childMethod() {
		super.parentVariable = 100;// 2
		int childVariable = 30; // Shadowing the instance variable

		System.out.println("Child Variable (local): " + childVariable);
		System.out.println("Child Variable (instance): " + this.childVariable);
		System.out.println("Parent Variable: " + super.parentVariable);// 2

		this.parentMethod(); // Calling parentMethod using 'this'
		super.parentMethod(); // Calling parentMethod using 'super'//4
	}
}

public class SuperUse {

	public static void main(String[] args) {
		ChildClass childObj = new ChildClass();
		childObj.childMethod();
	}
}
