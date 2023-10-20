package com.MethodOverriding;

class Super1{
	
	
	int num1=10;
	
	void show() throws ArithmeticException {
		System.out.println(num1);
	}
}
class SubChild1 extends Super1{
	
	int num2=0;
	
	void show() throws RuntimeException//,IOException
	{
		System.out.println(num1/num2);
	}
}
public class UncheckedExceptionDemo2 {

	public static void main(String[] args) {
		
		SubChild1 s1 = new SubChild1();
		s1.show();

	}

}
