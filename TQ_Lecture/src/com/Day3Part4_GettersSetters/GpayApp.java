package com.Day3Part4_GettersSetters;

public class GpayApp {
	
	
	public static void transferMoney(int amount,Account ac1) {
		
		ac1.setBalance(ac1.getBalance()-amount);
		
		System.out.println("Money tranfered Succefully\n"+
		"Current account balance is: "+ac1.getBalance());
		
	}
	

	public static void main(String[] args) {


		Account a1 = new Account();
		
		a1.acceptDetails(3395235160l,"Suraj Mali", 500000);
		
		transferMoney(10000, a1);
		
	
	}

}
