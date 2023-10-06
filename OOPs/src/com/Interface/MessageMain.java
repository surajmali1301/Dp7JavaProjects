package com.Interface;

interface MessageService{
	
	
	void sendMessage(String message);
}

class WhatsApp implements MessageService{
	
	public void sendMessage(String message) {
		System.out.println("Using WhatsApp");
		System.out.println("Message: "+message);
	}
	
}

class FaceBook implements MessageService{
	
	public void sendMessage(String message) {
		System.out.println("Using FaceBook");
		System.out.println("Message: "+message);
	}
}

public class MessageMain {

	public static void main(String[] args) {


		MessageService w ;
		w = new WhatsApp();
		w.sendMessage("HI");
		System.out.println("-----------");
		w = new FaceBook();
		w.sendMessage("Hello");

	}

}
