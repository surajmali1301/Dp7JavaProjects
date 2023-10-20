package com.StringsAssignment;

public class CountOfStrings {

	public static void main(String[] args) {

		String str = "Java is Programming Language";

		String[] arr = str.split("\\s");

		int count = arr.length;

		System.out.println(count);
	}

}
