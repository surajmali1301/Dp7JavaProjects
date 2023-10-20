package com.LabSession_Strings;

public class RemoveCharFirstLast {

	static void remove(String str) {

//		String str2 = str.substring(1, str.length() - 1);
//		System.out.println(str2);
		
		char s[]= str.toCharArray();
		for (int i = 1; i < s.length-1; i++) {
			System.out.print(s[i]);
		}
	}

	public static void main(String[] args) {

		String str = "Hello World";

		remove(str);
	}
}
