package com.Abstarct_Interface;

interface Bank{
	static String bankName="RBI";
	interface Locker{
		void showLocker();
		
	}
}

class Icici implements Bank.Locker{
	
	public void showLocker() {
		System.out.println("Locker of ICICI");
	}
}
public class NestednterFaceDemo {

	public static void main(String[] args) {


		Icici a;
		a = new Icici();
		a.showLocker();

	}

}
