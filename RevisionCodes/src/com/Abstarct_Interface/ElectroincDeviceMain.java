package com.Abstarct_Interface;

interface ElectronicDevice {

//	public float price;//by default public static final
	 static void show() {
		System.out.println("HardWare Shop");
	}

//	Device(){ Interface cannot have Constructor
//		
//	}

	void showDevice();
	void showTax(float gst); 
	void showPrice();
}

interface TaxAble {

	void showTax(float gst);//By Default: public abstract private default static
}

class LapTop implements ElectronicDevice, TaxAble {
	float price;
	
	LapTop(float price){// to initialize
		this.price=price;
	}

	public void showDevice() {
		System.out.println("Laptop : HP\nStorage: 1Tb Ssd\nRam:16Gb Ram");
	}

	public void showPrice() {
		System.out.println("Price of Laptop: " + price);
	}


	@Override
	public void showTax(float gst) {
		System.out.println("Tax On LapTop: " + (gst * price));
	}

}

class Printer extends LapTop implements ElectronicDevice{
	
	Printer(float price){
		super(price);
	} 	
	
	public void showDevice() {
		System.out.println("Hp color printer");
	}
	
	public void showPrice() {
		System.out.println("Printer Price: "+price);
	}
	
	public void showTax(float gst) {
		System.out.println("Tax On Printer: " + (gst * price));
	}
}

public class ElectroincDeviceMain {
	public static void main(String[] args) {

		ElectronicDevice d;
		d = new LapTop(60000f);
		d.showDevice();
		d.showPrice();
		d.showTax(0.18f);
		System.out.println("----------------");
		d = new Printer(30000);
		d.showDevice();
		d.showPrice();
		d.showTax(0.18f);
		
	}
}
