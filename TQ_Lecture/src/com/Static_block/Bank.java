package com.Static_block;

public class Bank {

	public static void main(String[] args) {


		Account a1 = new Account(12345,"Suraj",23456f);
		Account a2 = new Account(432,"Sanket",654332f);
		
		System.out.println("----------Default Interest----------");
		a1.show();
		a2.show();
		System.out.println("-----------------------------------");
		

	}

}
