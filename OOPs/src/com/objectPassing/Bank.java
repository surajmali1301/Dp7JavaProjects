package com.objectPassing;

class account {

	int id;
	String name;
	float balance;
	String status;

	account() {

	}

	public account(int id, String name, float balance, String status) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.status = status;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public String toString() {
		return " " + id + " " + name + " " + balance + " " + status;
	}

}

class Bank {
	static void checkStatus(account a) {
		if (a.getBalance() <= 0) {
			System.out.println("Deactive");
		} else {
			System.out.println("Active");
		}
	}

	public static void main(String[] args) {

		account a1 = new account(1, "Suarj", 35000f, null);
		account a2 = new account(6, "Hrishi",35000f, null);
		account a3 = new account(11, "Aniket", 45000f, null);

		System.out.println("-------------------");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println("-----------------Status-----------");
		checkStatus(a1);
		checkStatus(a2);
		checkStatus(a3);

	}
}
