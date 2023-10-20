package com.ExceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int x =10;
		int y =10;
		
		try {
			int ans = (x+y)/(x-y);
			
			System.out.println(ans);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("------------------");
		
		int result = (2*x)+(2*y);
		
		System.out.println("Result: "+result);
	}

}
