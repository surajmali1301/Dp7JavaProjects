package com.Lab_Session_OOPs;

import java.util.Scanner;

class sqCube {

	static int square(int num) {
		int total = num * num;
		return total;
	}

	static int cube(int num) {
		int total = num * square(num);
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		System.out.println("Square of num: "+square(num));
		System.out.println("Cube of num: "+cube(num));
	}
}
