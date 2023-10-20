package com.StringBufferBuilder;

public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		sb1.append("Hello");
		
		System.out.println(sb1.reverse());
		
		sb1.replace(0,1,"S");
		
		System.out.println("After Replacing: "+sb1);
		
		System.out.println(sb1.replace(1, 4, "MA"));
		
		System.out.println(sb1.indexOf("H"));
		
		System.out.println(sb1.substring(1, 3));
		
		System.out.println(sb1.insert(1, "Hi"));
		
		sb1.setCharAt(1, 'A');
		
		System.out.println(sb1);
		
		
	}

}
