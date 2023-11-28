package com.Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.HashMap.MarksComparator;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course c1 =  new Course(1,"Java",50000);
		Course c2 =  new Course(2,".net",40000);
		Course c3 =  new Course(3,"python",30000);
		Course c4 =  new Course(1,"Java",50000);
		
		HashMap<Student,Course> sMap = new HashMap<>();
		sMap.put(new Student(1,"Aniket",80),c1);
		sMap.put(new Student(15,"Anuj",80), c2);
		sMap.put(new Student(12,"kailas",80), c3);
		sMap.put(new Student(10,"Pralay",80), c4);
		
//		List<Map.Entry<Student,Integer>> smarks = new ArrayList<>
	}

}
