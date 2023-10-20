package com.MethodOverriding;


class Super{
	
	
	int num1=10;
	
	void show() {
		System.out.println(num1);
	}
}
class SubChild extends Super{
	
	int num2=0;
	
	void show() throws ArithmeticException{
		System.out.println(num1/num2);
	}
}
public class UncheckedExceptionDemo1 {

	public static void main(String[] args) {
	
		SubChild s= new SubChild();
		s.show();

	}

}
