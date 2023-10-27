package com.ArrayList;

public class Car implements Comparable<Car>{

	private int modelNo;
	private String colour;
	private float price;
	private Engine eng;

	public Car() {
	}

	public Car(int modelNo, String colour, float price, Engine eng) {
		this.modelNo = modelNo;
		this.colour = colour;
		this.price = price;
		this.eng = eng;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	
	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", colour=" + colour + ", price=" + price + ", eng=" + eng + "]";
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
//		Car c = (Car) o;
		if(this.getEng().getEngineType().compareTo(o.getEng().getEngineType())==0)
		if(this.getPrice()<o.getPrice())
			return 1;
		else if(this.getPrice()>o.getPrice())
			return -1;
		else 
			return 0;
		else
		return this.getEng().getEngineType().compareTo(o.getEng().getEngineType());
	}

	
}
