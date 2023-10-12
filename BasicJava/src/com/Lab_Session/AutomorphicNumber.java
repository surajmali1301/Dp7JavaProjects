package com.Lab_Session;

import java.util.*;

public class AutomorphicNumber {

	static boolean isAutomorphic(int num) {
		int numCopy = num;
		int count = 0;

		while (numCopy > 0) {
			numCopy /= 10;
			count++;
		}

		int pro = 1;

		for (int i = 0; i < count; i++) {
			pro *= 10;
		}

		int square = num * num;

		return square % pro == num;
	}

	public static void main(String[] args) {
		int num = 625;

		if (isAutomorphic(num)) {
			System.out.println(num + " is an automorphic number.");
		} else {
			System.out.println(num + " is not an automorphic number.");
		}
	}

}
