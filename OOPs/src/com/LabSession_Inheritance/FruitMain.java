package com.LabSession_Inheritance;

class Fruit{
	
	String name;
	boolean seasonal;
	String taste;
	int seeds;
	
	Fruit(){
		
		System.out.println("Fruit class const");
	}
	
	Fruit(String name,boolean seasonal,String taste,int seeds){
		this();
		this.name=name;
		this.seasonal=seasonal;
		this.taste=taste;
		this.seeds=seeds;
	}
	
	
}
class Mango extends Fruit{
	String descp;
	String season;
	
	Mango(String name,boolean seasonal,String taste,int seeds,String descp){
//		this("March");
		super(name,seasonal,taste,seeds);
		this.descp=descp;
	}
	Mango(String season){
		this.season=season;
	}
	void display() {
		System.out.println("FruitName: "+name+", Seasonal: "+seasonal+", Taste: "+taste+", Seeds: "+seeds);
		System.out.println("Description: "+descp);
	}
	
}


public class FruitMain {

	public static void main(String[] args) {


		Mango m = new Mango("Alphanso Mango",true,"Sweet",1,"king of fruits");
		m.display();
	}

}
