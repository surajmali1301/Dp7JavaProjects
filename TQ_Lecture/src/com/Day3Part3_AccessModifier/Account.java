package com.Day3Part3_AccessModifier;

public class Account {
	private int accNo;
	protected String name;
	private float balance;
	
	public void openAccount() {
		fillCustomerDetails(1307,"Suraj", 100000);
		showDetails();
	}
	
	private void fillCustomerDetails(int acNo,String name1,float bal1) {
		accNo=acNo;
		name=name1;
		balance=bal1;
	}
	
	void showDetails() {
		System.out.println("Account no: "+accNo);
		System.out.println("Account holder name: "+name);
		System.out.println("Account balance: "+balance);
	}

}
