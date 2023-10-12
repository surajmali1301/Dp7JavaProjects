package com.String1;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Java is fun";
		String s2 ="java";
		
		System.out.println("length: "+s1.length());
		
		System.out.println("concat: "+s1.concat("."));
		
		System.out.println("charAt: "+s1.charAt(6));
		
		System.out.println("substring: "+s1.substring(1));
		System.out.println("substring2: "+s1.substring(1, 3));
		
		System.out.println("contains: "+s1.contains("s"));
		
		System.out.println("equalsIgnoreCase: "+s1.equalsIgnoreCase(s2));
		
		System.out.println("toUpperCase: "+s1.toUpperCase());
		System.out.println("toLowerCase: "+s1.toLowerCase());
		
		System.out.println("indexOf: "+s1.indexOf('s'));
		System.out.println("lastIndexOf: "+s1.lastIndexOf('a'));
		
		System.out.println("lastIndexOf: "+s1.lastIndexOf("is"));
		
		System.out.println("isEmpty: "+s1.isEmpty());
		
		String s3 = "Java";
		String s4 = "Python";
		
		System.out.println(s3.length()>s4.length());
		
		System.out.println(s3.compareTo(s4));
		
		System.out.println(s1.compareTo(s4)>0);
	}

}
