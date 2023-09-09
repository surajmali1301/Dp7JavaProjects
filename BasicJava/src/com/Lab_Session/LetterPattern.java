package com.Lab_Session;

public class LetterPattern {

	public static void main(String[] args) {

		for (int i = 1; i < 8; i++) {// 5 iterations

			for (int j = 1; j < 8; j++) {
				if(j==1 || i==4 || j==7) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}

	}

}
