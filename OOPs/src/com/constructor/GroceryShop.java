package com.constructor;

class Item {

	private int id;
	private String name;
	private float price;

	Item() {

	}

	public Item(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return " " + id + " " + name + " " + price;
	}

}

public class GroceryShop {

	static void giveDiscount(Item i) {
		if (i.getPrice() > 200) // if every item is price > 200 then it will work
		{
			float p = i.getPrice();
			p = (p - (0.1f * p));
			i.setPrice(p);
		}
	}

	public static void main(String[] args) {

		Item i1 = new Item(1, "Choclate", 250f);
		Item i2 = new Item(2, "chips   ", 50f);
		Item i3 = new Item(3, "Biscuits", 10f);
		Item i4 = new Item(4, "FaceWash", 220f);
		Item i5 = new Item(5, "ChewGums", 20f);

		System.out.println("----------------------------------------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

		System.out.println("-------Discounted price per Item--------");
		giveDiscount(i1);
		giveDiscount(i2);
		giveDiscount(i3);
		giveDiscount(i4);
		giveDiscount(i5);

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}
}
