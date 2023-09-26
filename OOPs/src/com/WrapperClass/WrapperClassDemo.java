package com.WrapperClass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int num =23;
		
//		Auto-boxing-->primitive to Wrapper class 
		Integer i = new Integer(45);
		
		Integer j = Integer.valueOf(num);
		
		Integer k = num;
		
		System.out.println(num+" "+i+" "+ j+" "+k);
		
//		UnBoxing--->Wrapper class to Primitive
		Float f = new Float(3.14f);
		
		float f2 = f.floatValue();
		
		float f3 = f;
		
		
		System.out.println(f+" "+f2+" "+f3);

	}

}
