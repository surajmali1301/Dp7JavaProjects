package com.Interface;

interface TaxPay {
	String cName = "India";

	void taxAmount();

}

class Celebrity implements TaxPay {

	String celeName;
	float income;

	public Celebrity() {

	}

	public Celebrity(String celeName, float income) {
		this.celeName = celeName;
		this.income = income;
	}

	public void taxAmount() {
		System.out.println("Celebrity Amount of tax: " + (0.2 * income));
	}
}

class Employee implements TaxPay {

	String ename;
	float salary;

	public Employee(String ename, float salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}

	public void taxAmount() {
		if (salary > 500000) {
			System.out.println("Celebrity Amount of tax: " + (0.1 * salary));
		} else {
			System.out.println("Your salary is tax free");
		}
	}
}

public class TaxPayMain {

	public static void main(String[] args) {

		Celebrity c = new Celebrity("SRK", 7000000f);
		c.taxAmount();

		Employee e = new Employee("Suraj", 500000f);
		e.taxAmount();

	}

}
