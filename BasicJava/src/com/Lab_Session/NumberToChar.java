package com.Lab_Session;
import java.util.*;
public class NumberToChar {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		int num4= sc.nextInt();
		
		char n1 = (char)num1;
		char n2 = (char)num2;
		char n3 = (char)num3;
		char n4 = (char)num4;
		
		System.out.println(n1 +" "+ n2 +" "+ n3 +" "+ n4 +" ");
		
		
		
//		For LOOp
		for (int i = 65; i <=70; i++) {
			
			char ch = (char)i;
			System.out.println(ch);
		}
		

	}

}
