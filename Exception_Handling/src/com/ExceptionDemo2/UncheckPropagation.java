package com.ExceptionDemo2;


public class UncheckPropagation {
	
	
	void method1()
	{
		int data=50/0;
	}
	
	void method2()
	{
		method1();
	}
	
	void method3()
	{
		try
		{
		method2();
		}
		catch(Exception e)
		{
			System.out.println("In method 3:"+e);
		}
	}
	
	public static void main(String[] args) {
		
		UncheckPropagation obj1= new UncheckPropagation();
		obj1.method3();
		
	}

}
