package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyIntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o1-o2);//for descending order
	}
	
}
public class IntegerComparator {

	public static void main(String[] args) {


		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(-1);
		al.add(50);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
	}

}
