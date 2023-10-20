package com.ExceptionDemo2;

public class RethrowException2 {

	static void m1() {
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("In catch Block method");
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
	}

}
