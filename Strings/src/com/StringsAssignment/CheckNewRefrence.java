package com.StringsAssignment;

public class CheckNewRefrence {

	public static void main(String[] args) {

		String a = "Hello";

		String b = new String("Hello");

		System.out.println(a == b);

	}

}
