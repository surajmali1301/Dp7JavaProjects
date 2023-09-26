package com.Day3Part3_AccessModifier;

public class AccessModifierDemo {

	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.name="Mali";
		a1.openAccount();//public access modifier can access everywhere
		a1.showDetails();//private access modifier can access within class and within package 
	}
}
