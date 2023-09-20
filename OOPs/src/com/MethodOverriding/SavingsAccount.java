package com.MethodOverriding;

class SavingsAccount extends Account {
//
	private String panNumber;

	public SavingsAccount(int accNo, String name, float balance) {
		super(accNo, name, balance);
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public float getRateOfInterest() {
		rateOfInterest = 8.5f;
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	void deposit(float amount) {
		float b = balance + amount;
		if (b > 50000) {
			if (panNumber != null) {
				balance = b;
			} else {
				System.out.println("Please enter panumber Because You depositing money more than 50000");
			}
		}
	}

	void withdraw(float amount) {

		if ((balance - amount) > 0) {
			balance -= amount;
		} else {
			System.out.println("Insufficent balance " + balance);
		}
	}

}


