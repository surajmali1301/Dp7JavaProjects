package com.HashMap;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentHashMap2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<Integer, Student> shm = new HashMap<Integer, Student>();
		
		shm.put(101, new Student(101,"Anuj",90));
		shm.put(107, new Student(101,"Kailas",90));
		shm.put(103, new Student(101,"Pralay",90));
		shm.put(104, new Student(101,"Vishal",90));
		System.out.println(shm.put(104, new Student(104,"Hrishikesh",70)));
		shm.put(105, new Student(101,"Shivam",90));
		
//	
		for (Map.Entry<Integer, Student> e: shm.entrySet()) {
			System.out.println("ID: "+e.getKey());
//			System.out.println("Details: "+e.getValue());
			System.out.println("Details: "+e.getValue().getName()+" "+e.getValue().getName());
			System.out.println("-------------");
		}
		
	}

}
