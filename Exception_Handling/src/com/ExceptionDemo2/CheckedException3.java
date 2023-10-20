package com.ExceptionDemo2;

public class CheckedException3 {

	void m1() throws ClassNotFoundException{
		throw new ClassNotFoundException("Class Error");
	}
	void m2() throws ClassNotFoundException{
		m1();
	}
	void m3() throws ClassNotFoundException{
		
		try {
			m2();
		}
		catch(Exception e) {
			System.out.println("In m2"+e);
		}
	}
	public static void main(String[] args)throws Exception {

		
		CheckedException3 cp3 = new CheckedException3();
		cp3.m3();
		

	}

}
