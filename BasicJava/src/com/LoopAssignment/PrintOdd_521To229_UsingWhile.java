package com.LoopAssignment;

import java.util.Scanner;

public class PrintOdd_521To229_UsingWhile {

	public static void main(String[] args) {
		
		int num = 521;
		while (num >= 229) {
			if(num%2==1) {
			
			num = num - 2;
			System.out.println(num);
			}
		}

	}

}
