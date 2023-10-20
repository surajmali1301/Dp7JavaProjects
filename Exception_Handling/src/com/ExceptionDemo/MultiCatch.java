package com.ExceptionDemo;

import java.util.*;

public class MultiCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			int arr[] = new int[3];

			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the Number: ");
				arr[i] = sc.nextInt();
			}
			System.out.println("----------");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("ans: " + (100 / arr[i]));
			}
		} 
//		catch (Exception e) {//it will cause un-reachable code
//			System.out.println(e);
//		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("--------");
			System.out.println(e);
		}
		
		finally {
			sc.close();
			System.out.println("Scanner closed");
		}

	}

}
