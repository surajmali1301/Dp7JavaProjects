package com.StringsLogical;

public class StringIntern {

	public static void main(String[] args) {


		String s1 ="Java";
		
		String s2 = new String("Java");
		
		System.out.println(s1.intern());
		System.out.println(s2);
		// Saves m/m
//		eases comparison, we can compare with ==
	}

}
