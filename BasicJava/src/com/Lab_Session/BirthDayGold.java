package com.Lab_Session;
import java.util.*;
public class BirthDayGold {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		
		for (int i = 1; i <= year; i++) {
			System.out.println("On "+year +" birthday "+name+" "+i*i*i+" Gold coins");
		}


	}

}
