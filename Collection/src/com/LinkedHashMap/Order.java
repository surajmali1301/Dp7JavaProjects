package com.LinkedHashMap;

public class Order {

	private int id;
	private String oName;
	private int price;

	public Order(int id, String oName, int price) {
		super();
		this.id = id;
		this.oName = oName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", oName=" + oName + ", price=" + price + "]";
	}

}
