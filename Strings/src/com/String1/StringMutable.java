package com.String1;

public class StringMutable {

	public static void main(String[] args) {


		String s1 = "Java";//cannot modify String
		
		System.out.println(s1.hashCode());//"Java" has different hashCode
		
		s1="CoreJava";//Re-initialized
		
		System.out.println(s1.hashCode());//"CoreJava" has different hashCode
		
		System.out.println(s1);//Print New Value"CoreJava"
		System.out.println("-----------");
//*********************************		
		String s2 = "Suraj";
		System.out.println(s2.hashCode());
		
		s2.concat("Mali");
		System.out.println(s2.hashCode());
		
		System.out.println(s2);
		System.out.println("-----------");
//**********************************
		
		String s3 = "Suraj";
		System.out.println(s3.hashCode());
		s3=s3.concat("Mali");
		System.out.println(s3.hashCode());
		System.out.println(s3);
		System.out.println("-----------");
//***********************************
		
		String s4 = "SurajMali";
		System.out.println(s4.hashCode());
	}

}
