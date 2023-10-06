package com.VarArgs;

class Parent{
	// Cannot Override because number of arguments are not same/Unknown
	static void display(int ...a) {
		System.out.println(a);
	}
}

class Child extends Parent{
	
	//@Override
	static void display(int ...a) {
		System.out.println(a);
	}
}
public class VarArgsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
