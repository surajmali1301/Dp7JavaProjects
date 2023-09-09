package com.Lab_Session;

import java.util.*;

public class GuessingNumber {

	public static void main(String[] args) {

		int correctNum = 13;

		int atem = 0;

		while (correctNum!=0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number between 1 to 50");
			System.out.println("Enter number to guess");
			int guessNum = sc.nextInt();
			atem++;
		 if (guessNum > correctNum) {

				System.out.println("Please enter lower number");

			} else if (guessNum < correctNum) {

				System.out.println("Please enter higher number");

			}
			else {
//				System.out.println("Attempts: "+atem);
				System.out.println("You guessed correct number"+" in "+atem+" attempts");
				break;
			}
		 System.out.println("Attempts: "+atem);
		}
	}
}
