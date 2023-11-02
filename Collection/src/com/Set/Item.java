package com.Set;

import java.util.Objects;

public class Item {

	private int id;
	private String iName;
	private int price;
	
	public Item(int id, String iName, int price) {
		super();
		this.id = id;
		this.iName = iName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", iName=" + iName + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(iName, id, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(iName, other.iName) && id == other.id && price == other.price;
	}
	
	
}
