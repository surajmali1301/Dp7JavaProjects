package com.Coupling;


interface MessageService{
	
	void sendMessage(String meg);
}

class WhatsApp implements MessageService{
	
	String type;
	
	public void sendMessage(String msg) {
		this.type="WhatsApp";
		System.out.println("Type: "+msg);
	}
}

class Telegram implements MessageService{
	
	String type;
	public void sendMessage(String msg) {
		this.type="Telegram";
		System.out.println("Type: "+msg);
	}
}
public class LooseCouplingDemo {
	
	public void sendMessage(MessageService m) {
		m.sendMessage("Using WhatsApp");
	}

	public static void main(String[] args) {
		
		LooseCouplingDemo a = new LooseCouplingDemo();
		WhatsApp w  = new WhatsApp();
		
		a.sendMessage(w);
		
		Telegram t = new Telegram();
		a.sendMessage(t);
	}

}
