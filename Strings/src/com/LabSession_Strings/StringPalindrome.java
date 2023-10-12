package com.LabSession_Strings;

import java.util.Iterator;

public class StringPalindrome {

	static boolean palindrome(String s) {

		boolean status =false;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			status =false;
			for (int j = ch.length-1-i; j >=0; j--) {
				
			if (ch[i] == ch[j]) {
				status = true;
			}
			}
		}
		return status;
	}

	public static void main(String[] args) {

		String s = "Hello";

		System.out.println(palindrome(s));
	}

}
