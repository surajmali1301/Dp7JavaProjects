package com.AccessModifier;

public class AccessModifiers_2 {

	public static void main(String[] args) {
		
		
		AccessModifiers am = new AccessModifiers();
//		am.a=23; ---->Private access modifier cannot access within package
		am.b=90;
		am.c=987;
		
//		am.show();---->Private access modifier cannot access within package
		am.display1();
		am.diplay2();

	}

}
