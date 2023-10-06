package com.TQ;

abstract class PayTm {

	PayTm() {
		System.out.println("PayTm default const");
	}

	abstract float showBalance();

	void show() {
		System.out.println("Opening PayTm....");
	}
}

class DigitalPay extends PayTm {

	float showBalance() {
		super.show();
		return 10000f;
	}

}

public class AbstractMain {

	public static void main(String[] args) {

		DigitalPay p = new DigitalPay();
		System.out.println(p.showBalance());

	}

}
