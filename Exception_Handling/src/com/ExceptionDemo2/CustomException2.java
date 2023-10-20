package com.ExceptionDemo2;

import java.util.*;

public class CustomException2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your age: ");
		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new VotingEligibilityException("You Cannot Vote");
			}
			System.out.println("You are Eligible for Voting");
		} catch (VotingEligibilityException v) {
			System.out.println(v);
		}

	}

}
