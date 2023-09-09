package com.Lab_Session;

import java.util.*;

public class automorphic {

	static boolean automorphic(int num) {
		int sq = num * num;

		int count = 0;
		int temp = num;

		while (temp > 0) {
			count++;
			temp /= 10;
		}

		int rem;
		int p = 1;

		for (int i = 0; i < count; i++) {
			p *= 10;//25
		}
		rem = sq % p;

		return num == rem;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		if (automorphic(num)) {
			System.out.println(num + " is automorphic");
		} else {
			System.out.println(num + " is not automorphic");
		}

	}

}
