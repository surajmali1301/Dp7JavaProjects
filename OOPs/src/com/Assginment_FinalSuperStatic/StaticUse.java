package com.Assginment_FinalSuperStatic;

class ExampleClass {
	static int staticVariable = 10;

	static void staticMethod() {
		System.out.println("Static method");
		System.out.println("Static Variable: " + staticVariable);

		// Cannot use 'this' or 'super' in a static context
		// System.out.println(this.staticVariable); // This will cause an error
		// System.out.println(super.staticVariable); // This will cause an error
	}
}

public class StaticUse {
	public static void main(String[] args) {
		ExampleClass.staticMethod();
	}

}
