package com.LabSession_Inheritance;


interface Bank{
	
	default void displayBank() {
		System.out.println("Showing bank");
	}
}

interface Sbi extends Bank{
	
	default void displayBank() {//only default
		System.out.println("Displaying Sbi bank");
	}
}

interface Hdfc extends Bank{
	
	default void displayBank() {
		System.out.println("displaying Hdfc Bank");
	}
}



class RateOfInterest implements Sbi,Hdfc{
	
	public void displayBank() {//default to public
		Sbi.super.displayBank();
		Hdfc.super.displayBank();
		System.out.println("Displaying RateOfInterest");
	}
}
public class DiamondProblem2 {

	public static void main(String[] args) {


		RateOfInterest a= new RateOfInterest();
		a.displayBank();
		
	}

}
