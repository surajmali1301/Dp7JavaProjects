package com.p2;
import com.Day3Part3_AccessModifier.*;
public class AccessModiferDemo2 {

	public static void main(String[] args) {
		Account a2 = new Account();
		a2.openAccount();
//		a2.showDetails();  " default " access modifier access only within class
	}
}
