package com.LabSession;

public class Bike implements Comparable<Bike>{

	private int id;
	private String name;
	private float price;
	private int modelYear;

	public Bike(int id, String name, float price, int modelYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.modelYear = modelYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", price=" + price + ", modelYear=" + modelYear + "]";
	}

	@Override
	public int compareTo(Bike b) {
		// TODO Auto-generated method stub
		if(this.price==b.price)
			return this.name.compareTo(b.name);
		else
			if(this.price>b.price)
				return 1;
			else 
				return -1;
	}

}
