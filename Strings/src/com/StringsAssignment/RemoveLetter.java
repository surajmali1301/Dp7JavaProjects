package com.StringsAssignment;

public class RemoveLetter {

	public static void main(String[] args) {

		String str = "Java is Programming Language";

		char remove = 'a';

		String result = str.replaceAll(str.valueOf(remove), "");
		System.out.println(result);
	}

}
