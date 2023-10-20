package com.ExceptionDemo2;

class Account{
	
	private int id;
	private String name;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	void deposit(double amount) {
		balance+=amount;
		System.out.println("Amount deposited: "+amount);
		System.out.println("New Balance: "+balance);
	}
	void withdraw(double amount) {
		
		try {
			if(this.balance-amount<0)
				throw new InsufficentBalanceException("Balance is Low");
			this.balance-=amount;
			System.out.println("Amount withdraw "+amount);
			System.out.println("New balance: "+balance);
		} catch (InsufficentBalanceException e) {
			System.out.println(e);
		}
	}
	
}
public class Bank {

	public static void main(String[] args) {


		Account a = new Account();

		a.setId(121);
		a.setName("Ram");
		a.setBalance(1000);
		a.deposit(1000);
		a.withdraw(3100);
		a.deposit(2000);
	}

}
