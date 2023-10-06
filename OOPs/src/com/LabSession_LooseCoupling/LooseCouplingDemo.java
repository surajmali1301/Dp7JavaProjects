package com.LabSession_LooseCoupling;

interface Payment{
	abstract void paying();
}

class CreditCard implements Payment{
	
	int amt;
	CreditCard(int amt){
		this.amt=amt;
	}
	public void paying(){
		System.out.println("Rs"+amt+" paying from credit Card");
	}
}

class DebitCard implements Payment{
	
	int amt;
	DebitCard(int amt){
		this.amt=amt;
	}
	public void paying() {
		System.out.println("Rs"+amt+" paying from Debit Card");
	}
}
public class LooseCouplingDemo {

	public static void main(String[] args) {
		
		
		CreditCard c = new CreditCard(40000);
		c.paying();
		DebitCard a = new DebitCard(50000);
		a.paying();
	}
}
