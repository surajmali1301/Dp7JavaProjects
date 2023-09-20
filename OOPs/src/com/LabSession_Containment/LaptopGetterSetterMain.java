package com.LabSession_Containment;

public class LaptopGetterSetterMain {

	public static void main(String[] args) {

		Printer p = new Printer();
		Laptop l = new Laptop();
		
		l.setConfig("16GbRam1TbSsd");
		l.setbName("AsusTUF");
		l.setPrice(70000);
		l.setPrinter(p);
		l.setPrinter(p);
		p.setbName("Epson");
		p.setType("Color");
		p.setPrice(20000);
		l.getConfig();
		l.getbName();
		l.getPrice();
		
		System.out.println(l);
		System.out.println("PrinterDetails Details: ");
		System.out.println("PrinterName: "+p.getbPName());
		System.out.println("PrinterType: "+p.getType());
		System.out.println("PrinterPrice: "+p.getPrice());
		
	}

}
