package com.VarArgs;

import java.util.Iterator;

public class VarArgsDemo1 {

	static void display(int a, int b) {
		System.out.println((a + b));
	}

	static void display(int a, int b, int c) {
		System.out.println((a + b + c));
	}

	static void display(int a,String... str) {

		System.out.println(a);
		for (String i : str) {

			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		display(10, 20);
		display(30, 40, 50);
		display(13,"Suraj");

	}

}
