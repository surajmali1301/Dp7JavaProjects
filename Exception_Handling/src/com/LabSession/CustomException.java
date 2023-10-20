package com.LabSession;
import java.util.*;
public class CustomException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num=99999;
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		try {
		if(n>num)
			throw new OutOfRangeException("Out of Range Given Number");
			System.out.println("Number Within Range");
		
		}
		catch(OutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}

}
