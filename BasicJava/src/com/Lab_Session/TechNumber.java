package com.Lab_Session;

// 1.find count
// 2.check count even or odd
// 3.it even separate them addition of the then make square of addition.
import java.util.Scanner;

class TechNumber {
	public static void main(String[] args) {
		int firstHalf, sh, sum, sqr = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int p = 1;
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;

		}
		if (count % 2 == 0) {
			for (int i = 1; i <= count / 2; i++) {
				p *= 10;

				firstHalf = temp / p;
				sh = temp % p;
				sum = firstHalf + sh;
				sqr = sum * sum;

			}

			if (temp == sqr) {
				System.out.println(temp + " is Tech number");
			} else {
				System.out.println(temp + " is not Tech number");
			}
			
		}
		else {
			System.out.println("Enter Even digit Number");
		}
	}
}