package com.Assignment_Operators;

public class QQ11_Operator {

	public static void main(String[] args) {
		int x = 001, y = 010;// Octal Value of 010 is 8,
		int z = 100;

		int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
// 				0  +  09  - 100 - 98 +  010 - -1 +  09  - -2

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		System.out.println("i=" + i);
	}
}
