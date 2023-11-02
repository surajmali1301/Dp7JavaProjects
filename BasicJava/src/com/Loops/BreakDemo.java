package com.Loops;

public class BreakDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5)
				break;// comes out of loop
		}
		System.out.println("=======");
//		for ( i = 0; i < 10; i++) {
//			if (i == 5)
//				break;
//			System.out.println(i);
//		}

		int num1=1234;
		do {
			System.out.println(num1);
			num1/=10;
		} while (num1!=0);
		 System.out.println("----------------");
		int num=1234;
		int rev;
		 while (num!=0) {
			 rev=num%10;
			 System.out.println(rev);
			 num/=10;
		 }
	}

}
