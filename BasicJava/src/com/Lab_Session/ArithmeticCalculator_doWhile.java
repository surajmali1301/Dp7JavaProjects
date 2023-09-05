package com.Lab_Session;

import java.util.Scanner;

public class ArithmeticCalculator_doWhile {

	public static void main(String[] args) {

		do {
			System.out.println("1.Addition(+) 2.Subtraction(-) 3.Multiplication(*) 4.Division(/) 5.Remainder(%)");

			Scanner ip = new Scanner(System.in);
			System.out.print("Enter First Number:");
			int num1 = ip.nextInt();
			System.out.print("Enter the choice:");
			int c = ip.nextInt();
			System.out.print("Enter Second Number:");
			int num2 = ip.nextInt();
			switch (c) {
			case 1:
				System.out.println("Addition: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Substraction: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplication: " + (num1 * num2));
				break;
			case 4:
				System.out.println("Division: " + (num1 / num2));
				break;
			case 5:
				System.out.println("Remainder: " + (num1 % num2));
			default:
				System.out.println("Enter valid Operator.");
//				System.exit(0) will terminate code when user enter wrong choice (code will not run in infinite loop)12.40PM 04/09/2023
			System.out.println("Do you want continue?(y/n)");
			char ch1 = ip.next().charAt(0);
			}
		} while (true);

	}

}
