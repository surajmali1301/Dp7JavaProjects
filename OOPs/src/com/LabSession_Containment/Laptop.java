package com.LabSession_Containment;

public class Laptop {

	String config;
	String bName;
	int price;
	Printer printer;

	
	Laptop() {

	}
	
	Laptop(String config,String bName,int price,Printer printer){
		this.config=config;
		this.bName=bName;
		this.price=price;
		this.printer=printer;
	}
	
	
	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public String toString() {
		return  "LaptopDetails: "+"\nLaptopConfigs: "+config+"\nBrandName: "+bName+"\nPrice: "+price;  
	}

	

}
