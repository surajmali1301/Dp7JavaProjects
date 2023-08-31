package com.Assignment_Operators;

public class Q4_Operator {

	public static void main(String[] args) {
		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;
		//11 + 22 + 11  + 22  +  13 + 24=103
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}
}
