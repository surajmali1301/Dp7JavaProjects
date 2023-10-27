package com.StringsLogical;

public class ReverseString {

	static void reverse(String s) {
		String rev = "";

		for (int i = s.length()-1; i > -1; i--) {
			rev = rev + s.charAt(i);
		}

		rev=rev+" ";
		System.out.println("After: " + rev);
	}

	public static void main(String[] args) {

		String str = "I like to learn Java";

		System.out.println("Before: " + str);

		reverse(str);
	}
}
