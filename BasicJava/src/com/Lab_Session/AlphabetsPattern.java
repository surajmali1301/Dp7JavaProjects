package com.Lab_Session;

public class AlphabetsPattern {

	public static void main(String[] args) {

		
		char alpha='A';
		for (int i = 1; i <= 5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(alpha+" ");
				alpha++;
			}
			System.out.println();
		}
		

	}

}

