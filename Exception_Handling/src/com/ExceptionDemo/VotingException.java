package com.ExceptionDemo;
import java.util.*;
public class VotingException {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			
			if(age>18) {
				System.out.println("You can Vote");
			}
			else {
				System.out.println("You Cannot Vote");
			}
		} catch (Exception e) {//InputMismatchException
			System.out.println(e);
		}
		
		finally {
			sc.close();
			System.out.println("Thank You For Voting");
		}

	}

}
