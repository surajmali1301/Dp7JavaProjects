package com.Day3Part4_GettersSetters;

public class Account {

	private long accNo;
	private String name;
	private float balance;
	
	public long getAccno() {
		return accNo;
	}
	public void SetAccno(int accNo) {
		this.accNo=accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance=balance;
	}
	
	void acceptDetails(long accN,String name1,float bal) {
		this.accNo=accN;
		this.name=name1;
		this.balance=bal;
	}
}
