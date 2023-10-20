package com.LabSession_Strings;

import java.util.Arrays;

public class AverageOfNumber {

	static double average(String str) {

		int sum = 0;
		int count = 0;
		char c[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			if (c[i] >= '0' && c[i] <= '9') {
				sum += c[i] - 48;
				count++;

			}
		}

		return sum / count;

	}

	public static void main(String[] args) {

		String s = "S1u5r8a7";

		System.out.println(average(s));
	}

}
