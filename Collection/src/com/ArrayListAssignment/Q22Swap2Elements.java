package com.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Q22Swap2Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
	int temp =list.get(2);
	list.set(2,list.get(3));
	list.set(3,temp);
		
		System.out.println(list);
	}

}
