package com.StringsAssignment;

public class FindCountOfLetter {

	public static void main(String[] args) {

		String str = "Java is Programming Language";
		char find = 's';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == find) {
				count++;
			}
		}
		System.out.println("The count of character is " + count);
	}

}
