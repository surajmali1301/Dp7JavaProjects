package com.MethodOverriding;

import java.io.IOException;

class SuperClass {

	int num1 = 10;

	void show() {
		
	}
	void print(){
		
	}
}

class ChildClass extends SuperClass {

	int num2 = 0;

	void show() throws ArithmeticException, NullPointerException {
		System.out.println(num2);
	}
   void print() throws RuntimeException{
	}
}

public class CheckedExceptionDemo3 {

	public static void main(String[] args) {

		ChildClass c = new ChildClass();
		c.show();

	}

}
