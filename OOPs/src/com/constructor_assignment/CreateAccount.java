package com.constructor_assignment;

//Question--1 create class with member variable
class Account {

	public long accountNumber;
	public String customerName;

//	public Account() {
//		long accountNumber=33593215068l;
//		String customerName= "Suraj Mali";
//	}

//Question--3	create default const assign new values
	Account() {// prints default values
		long accountNumber = 1234567l;
		String customerName = "J B";
		System.out.println("I am in default constructor");
	}

//Question--5 define constructor that take all values print SOP parameterized
	public Account(long accountNumber, String customerName) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		System.out.println(" I am in parameterized conztructor");
	}

	public String toString() {
		return " Account Number: " + accountNumber + " customer Name: " + customerName;
	}

}

public class CreateAccount {
	public static void main(String[] args) {

		// Question--4 create another object
		Account a2 = new Account(123456, "suraj mali");
		System.out.println(a2);

		// Question--7 Create2 new OBJ with different information
		Account n1 = new Account(1111777, "Aniket");
		Account n2 = new Account(2233445, "Hrishi");


	}
}
