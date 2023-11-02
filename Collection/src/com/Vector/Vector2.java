package com.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> vl = new Vector<Integer>();
		
		vl.add(10);
		vl.add(5);
		vl.add(10);
		vl.add(null);
		vl.add(null);
		vl.add(-34);
		
		System.out.println(vl);
		
		System.out.println("-----------------------");
		//2nd Way
		for (int i = 0; i < vl.size(); i++) {
			System.out.println(vl.get(i)+" ");
		}
		
		//3rd Way
		
		for (Integer n : vl) {
			System.out.print(n+" ");
		}
		
		//4th Way
		
		Iterator<Integer> vl1 = vl.iterator();
		
		while (vl1.hasNext()) {
		
			System.out.print("\n"+vl1.next());
			
		}
		
		ListIterator<Integer> vl2 = (ListIterator<Integer>) vl.iterator();
		
		while (vl1.hasNext()) {
		
			System.out.print("\n"+vl1.next());
			
		}
		
		Enumeration<Integer> vl3 = vl.elements();
		
		while (vl3.hasMoreElements()) {
			Integer integer = (Integer) vl3.nextElement();
			
			System.out.println(integer);
		}
	}

}
