package com.Static_block;

public class Account {

	private int accId;
	private String name;
	private float balance;
	
	public static String bankName;
	public static float iRate=7.2f;
	static {
		System.out.println("Static block1 get executed");
		bankName="ICICI";
		
	}
	Account(int id,String name,float balance){
		this.accId=id;
		this.name=name;
		this.balance=balance;
	}
	
	public static void changeInterestRate(float f) {
		iRate=f;
	}
	Account(){
		System.out.println("Default Contructor");
		accId=0;
		name=null;
		balance=0;
	}
	static {
		System.out.println("Static block 2 get executed...");
		iRate=7.2f;
		changeInterestRate(10.67f);
	}
	
	void show() {
		System.out.println("Id"+accId);
		System.out.println("Bank Name:"+Account.bankName);
		System.out.println("Name"+name);
		System.out.println("Balance"+balance);
		System.out.println("Interest rate applicable for you.."+iRate);
	}
}
