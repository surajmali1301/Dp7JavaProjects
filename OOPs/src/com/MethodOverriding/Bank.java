package com.MethodOverriding;

class Account {
	private int accNo;
	private String name;
	protected float balance;
	protected float rateOfInterest;

	public Account() {

	}

	public Account(int accNo, String name, float balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public float getRateOfInterest() {
		rateOfInterest = 5;
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	void deposit(float amount) {
		balance += amount;
	}

	void withdraw(float amount) {

		if ((balance - amount) > 0) {
			balance -= amount;
		} else {
			System.out.println("Insufficent balance " + balance);
		}
	}

}

public class Bank {

	public static void main(String[] args) {

		Account a1 = new Account(101, "Suraj", 2000);

		System.out.println("AccountDetails:" + a1.getAccNo() + " " + a1.getBalance());

		System.out.println("Rate: " + a1.getRateOfInterest());

		a1.deposit(10000);
		System.out.println("Balance: " + a1.getBalance());

		a1.withdraw(5000);
		System.out.println("Balance: " + a1.getBalance());

		System.out.println("----------------------------------");

		SavingsAccount s1 = new SavingsAccount(201, "Shivam", 5000);

		System.out.println("Savings AccountDetails:" + s1.getAccNo() + " " + s1.getBalance());

		System.out.println("Rate: " + s1.getRateOfInterest());

		s1.deposit(20000);
		System.out.println("Balance: " + s1.getBalance());

		s1.withdraw(5000);
		System.out.println("Balance: " + s1.getBalance());
	}

}
