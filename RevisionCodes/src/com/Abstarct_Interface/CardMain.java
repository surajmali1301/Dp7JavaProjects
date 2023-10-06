package com.Abstarct_Interface;

abstract class Card{
	String cardGreet;
	

	Card(String cardGreet){
		this.cardGreet=cardGreet;
	}
	
	abstract void showCard();
	abstract void greet();
}

class BirthdayCard extends Card{
	
	
	BirthdayCard(String cardGreet){
		super(cardGreet);
	}
	
	public void showCard() {
		System.out.println("Birthday card");
	}
	public void greet() {
		System.out.println(super.cardGreet);
	}
	
}

class WeddingCard extends Card{
	
	
	WeddingCard(String cardGreet){
		super(cardGreet);
	}
	
	public void showCard() {
		System.out.println("Wedding Anniversary card");
	}
	public void greet() {
		System.out.println(super.cardGreet);
	}
	
}
public class CardMain {

	public static void main(String[] args) {


		Card b ;
		b= new BirthdayCard("Happy BirthDay");
		b.showCard();
		b.greet();
		System.out.println("---------------------------");
		b = new WeddingCard("Happy wedding Anniversary");
		b.showCard();
		b.greet();
		

	}

}
