package com.StringsAssignment;

public class FindWord {

	public static void main(String[] args) {

//					 0     1      2			3
		String str = "Java is Programming Language";

		String word = "Java";

		int find = str.indexOf(word);

		if (find != -1) {
			System.out.println("Word found at index: " + find);
		} else {
			System.out.println("Word not found");
		}

	}

}
