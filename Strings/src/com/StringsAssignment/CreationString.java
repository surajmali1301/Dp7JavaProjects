package com.StringsAssignment;

public class CreationString {

	public static void main(String[] args) {


		String s1 ="Hello";
		String s2 = "Hello";
		
		System.out.println(s1==s2);//== compares memory address
		System.out.println(s2.equals(s1));//.equals compares content/value
		System.out.println("--------------");
		
		String s3 = new String("World!");
		String s4 = new String("World!");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println("---------------");
		
		String s5 ="Hi";
		String s6 = new String("Hi");
		
		System.out.println(s5==s6);
		System.out.println(s6.equals(s5));
	}

}
