package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List st=new ArrayList<>();
		
		st.add(1);
		st.add("Suraj");
		st.add('A');
		
		System.out.println(st);
		
		for (int i = 0; i < st.size(); i++) {
			int data = (int)st.get(i);
			st.set(i, data);
		}
		System.out.println(st);
	}

}
