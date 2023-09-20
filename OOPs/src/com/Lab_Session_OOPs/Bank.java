package com.Lab_Session_OOPs;
import java.util.*;
public class Bank {

	public static void main(String[] args) {

		float balance = 10000.0f;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter Customer Name");
		String custName1 = sc.next();
		
		System.out.println("You want 'C' credit OR 'D' Debit Money");
		char ch = sc.next().charAt(0);
		
		CustomerBank cb = new CustomerBank();
		
		cb.setCustId(id);
		cb.setCustName(custName1);
		
		if(ch=='C') {
			 System.out.println("Enter the money to Crebit");
			 int amount= sc.nextInt();
			float total = balance+amount;
			cb.setCheackBalance(total);
			total=cb.getCheackBalance();		
		   System.out.println(amount+" Amount Creadited");
		  	  
		}
		else {
			 System.out.println("Enter the money to Debit");
			 int amount= sc.nextInt();
			float total = balance-amount;
			cb.setCheackBalance(total);
			balance=cb.getCheackBalance();
			System.out.println(amount+ " Amount debited");
			
		}
		System.out.println("-----------------------------------------");
		System.out.println("Available balance is: "+cb.getCheackBalance());
//		
		

	}

}
