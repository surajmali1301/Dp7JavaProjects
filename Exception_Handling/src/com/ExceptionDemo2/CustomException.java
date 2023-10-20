package com.ExceptionDemo2;
import java.util.*;
public class CustomException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		
		String name = sc.next();
		
		try {
			
			if(name.length()<3) {
				throw new InvalidNameException("Name Should be greater than 2 character");
			}
			System.out.println("Welcome "+name);
		} catch (InvalidNameException e) {
			System.out.println(e);
		}
	}

}
