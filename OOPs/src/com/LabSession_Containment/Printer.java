package com.LabSession_Containment;

public class Printer {

	String bPName;
	String type;
	int price;
	
	
	Printer(){
		
	}
	Printer(String bName,String type,int price){
		this.bPName=bName;
		this.type=type;
		this.price=price;
	}
	public String getbPName() {
		return bPName;
	}
	public void setbName(String bName) {
		this.bPName = bName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	public String toString() {
//		return  "\nBrandName: "+bName+"\nType: "+type+"\nPrice "+price;  
//	}
}
