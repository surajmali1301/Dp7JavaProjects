package com.StaticKeyword;

class Counter
{
   int x;	// Each object created from this class will have its own 'x'.
   static int count=0;
   
   {
//   This (instance) block of code is executed every time an object of the class is created.
//   It increments the static variable 'count'.
	   System.out.println("In instance block");
	   count++;
   }
   
   Counter()
   {
	   System.out.println("Default constuctor");
	   x=10;
	  // count++;
   }
   
   Counter(int x)
   {
	   //this();
	   this.x=x;
	   System.out.println("Parameterized");
   }
	
	
}

public class HitCounterApp {
	
	public static void main(String[] args) {
		
		Counter c = new Counter();
//		Counter c1 = new Counter(9);
		System.out.println(Counter.count);//Whenever Object get created 'count' get incremented
		
		Counter c1 = new Counter(8);
		System.out.println(Counter.count);
		
	}

}
