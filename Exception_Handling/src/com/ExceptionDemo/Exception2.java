package com.ExceptionDemo;

public class Exception2 {

	public static void main(String[] args) {


		try {
		String n = null;
		
		System.out.println(n.length());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
