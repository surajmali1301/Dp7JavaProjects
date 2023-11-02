package com.ArrayListQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Q1ArrayList_Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> n = new ArrayList<>();
		
		n.add(11);
		n.add(12);
		n.add(13);
		n.add(14);
		n.add(15);
		
		//normal for loop
		for (int i = 0; i < n.size(); i++) {
			System.out.println(n);
			break;
		}
		
		//Enhance for loop
		
		for (Integer integer : n) {
			System.out.print(integer+" ");
		}
		
		//iterator
		
		Iterator<Integer> a = n.iterator();
		
		System.out.println();
		while(a.hasNext()) {
			System.out.print(a.next()+" ");
		}
		
		//List Iterator-Forward
		ListIterator<Integer>a2 = n.listIterator();
		
		while(a2.hasNext()) {
			System.out.println(a2.next());
		}
		
		//List Iterator-Backword
		
       ListIterator<Integer>a3 = n.listIterator(n.size());
		
		while(a3.hasPrevious()) {
			System.out.print(a3.previous()+" ");
		}
	}

}
