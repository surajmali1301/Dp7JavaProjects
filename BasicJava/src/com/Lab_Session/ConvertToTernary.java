package com.Lab_Session;

import java.util.*;

class Medal {
	static void checkScore(int score) {

		if (score < 40000) {
			if (score < 25000) {
				System.out.println("Bronze Medal");
			} else {
				System.out.println("Silver Medal");
			}
		} else if (score >= 60000) {
			System.out.println("Platinum Medal");
		} else {
			System.out.println("Gold Medal");
		}

		String check = (score < 40000) ? (score < 25000) ? "Bronze Medal" : "Silver Medal"
				: (score >= 60000) ? "Platinum Medal" : "Gold Medal";
		System.out.println(check);

	}
}

public class ConvertToTernary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Score: ");
		int score = sc.nextInt();
		Medal.checkScore(score);

	}

}
