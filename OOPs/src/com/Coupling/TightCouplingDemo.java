package com.Coupling;

interface MessageService1{
	
	void sendMessage(String meg);
}

class WhatsApp1 implements MessageService1{
	
	String type;
	
	public void sendMessage(String msg) {
		this.type="WhatsApp";
		System.out.println("Type: "+msg);
	}
}

class Telegram1 implements MessageService1{
	
	String type;
	public void sendMessage(String msg) {
		this.type="Telegram";
		System.out.println("Type: "+msg);
	}
}
public class TightCouplingDemo {
	
	public void sendMessage(WhatsApp m) {
		m.sendMessage("Using WhatsApp");
	}

	public static void main(String[] args) {

		TightCouplingDemo a = new TightCouplingDemo();
		WhatsApp w  = new WhatsApp();
		
		a.sendMessage(w);
		
		Telegram t = new Telegram();
//		a.sendMessage(t);

	}

}
