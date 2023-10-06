package com.LabSession_LooseCoupling;

interface Keyboard{
	
	String display();
}

class Dell implements Keyboard{
	
	public String display() {

		return "Dell (RGB) Keyboard";
	}
}

class Hp implements Keyboard{
	
	public String display() {

		return "Hp KeyBoard";
	}
}

class Key{
	void display(Keyboard k) {
		System.out.println(k.display());
	}
}
public class LooseDemo {

	public static void main(String[] args) {
		
		Dell d = new Dell();
		Key k = new Key();
		Hp h = new Hp();
//		System.out.println(h.display());
//		System.out.println(d.display());
		k.display(d);
		k.display(h);
	}

}
