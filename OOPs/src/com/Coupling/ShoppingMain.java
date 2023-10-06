package com.Coupling;

interface Payment{
	
	void doTransaction(double amount);
}

class CreditCard implements Payment{
	
	private int cardNo;
	private int cvv;
	private double limit;
	
	public CreditCard() {
		super();
	}
	
	public CreditCard(int cardNo,int cvv,double limit) {
		this.cardNo=cardNo;
		this.cvv=cvv;
		this.limit=limit;
	}
	
	public void doTransaction(double amount) {
		
		if((this.limit-amount)>0) {
			System.out.println("CreditCard is debited by: "+amount);
		}
		else {
			System.out.println("Insufficent balance"+this.limit);
		}
	}
}

class DebitCard implements Payment{
	
	private int cardNo;
	private double balance;
	
	public DebitCard() {
		super();
	}
	
	public DebitCard(int cardNo,double balance) {
		this.cardNo=cardNo;
		this.balance=balance;
		
	}
	
	public void doTransaction(double amount) {
		
		if((this.balance-amount)>=1000) {
			System.out.println("DebitCard is debited by: "+amount);
		}
		else {
			System.out.println("Insufficent balance"+this.balance);
		}
	}
}
public class ShoppingMain {
	
	String name;
	long mno;
	
	public ShoppingMain() {
		
	}

	public ShoppingMain(String name, long mno) {
		super();
		this.name = name;
		this.mno = mno;
	}


	public void payBill(Payment p,float amt) {
		p.doTransaction(amt);
	}
	
	public void payBill(Payment p,float amt,float discount) {
		amt=amt-((discount/100)*1000);
		p.doTransaction(amt);
	}

	public static void main(String[] args) {

		ShoppingMain a = new ShoppingMain("Suraj",80806137);
		
		CreditCard c1 = new CreditCard(250498,398,40000);
		
		a.payBill(c1,20000);
		
		DebitCard dc = new DebitCard(74185,50000);
		
		a.payBill(c1, 20000, 10);

		

	}

}
