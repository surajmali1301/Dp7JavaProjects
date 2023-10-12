package com.LabSession_Array;

public class Product {

	private int pID;
	private String pName;
	private String pCategory;
	private float  price;
	private int pStock;
	
	public Product() {
		
	}

	public Product(int pID, String pName, String pCategory, float price, int pStock) {
		this.pID = pID;
		this.pName = pName;
		this.pCategory = pCategory;
		this.price = price;
		this.pStock = pStock;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	@Override
	public String toString() {
		return "Product [pID=" + pID + ", pName=" + pName + ", pCategory=" + pCategory + ", price=" + price
				+ ", pStock=" + pStock + "]";
	}
	
	
}
