package com.Lab_Session_OOPs;

public class Classitem {
	int itemId;
	String itemName;
	 float price;
	 
	 void display( ) {
		System.out.println("item id: "+itemId);
		System.out.println("item name: "+itemName);		
		System.out.println("item Price: "+price);
	}
public static void main(String[] args) {
		
		Classitem it = new Classitem();
		it.itemId=122;
		it.itemName="Lays";
		it.price=50.0f;
		
		it.display();
		
	}
}
