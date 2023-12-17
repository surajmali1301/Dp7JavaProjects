package com.Lab;
import java.util.Collection;
import java.util.HashMap;
/*create a map in which coursename is a key and number of students in that course is value 
<"java" , 8>
<"angular" , 10>

create a map in which 
feespaid string will be key and number of students who paid fees is value 
and same for feesnotpaid
<"feespaid" , 5> 
<"feesnotpaid" , 12>
map will have only 2 entries 

create a map in which courseobject will be key and arraylist of studentnames will be value 
<course(1,java,9000) , arraylist{"suraj" , "kailash" }*/
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Iterator<String> itr = hMap.ite
		Course2 c = new Course2(1,"Java",50000);
		
//		HashSet<Student2> hSet = new HashSet<>();
//		hSet.add(new Student2(1,"Aniket",50, 50000));
//		hSet.add(new Student2(2,"Hrishkesh",30, 50000));
//		hSet.add(new Student2(3,"Pralay",33, 45000));
//		hSet.add(new Student2(4,"Vishal",30, 50000));
		
		HashSet<Student3> hSet = new HashSet<>();
		hSet.add(new Student3(1,"Aniket",45000,c));
		hSet.add(new Student3(2,"Hrishkesh",30000,c));
		hSet.add(new Student3(3,"Pralay",50000,c));
		hSet.add(new Student3(4,"Vishal",25000,c));
		 
//		for(Student2 student: hSet) {
//			if(student.getFeesPaid()==c.getFees()) {
//				if(student.getMarks()<35) {
//					student.setMarks(35);
//				}
//				System.out.println(student);
//			}
//		}
		
		HashMap<String,Integer> hMap= new HashMap<>();
		hMap.put("FeesPaid", 0);
		hMap.put("FeesNotPaid", 0);
		
		Iterator<Student3> itr1 = hSet.iterator();
		int count=0;
		while(itr1.hasNext()) {
			Student3 stud3 = itr1.next();
			if(stud3.getFeesPaid()==stud3.getC().getFees()) {
				
			
			if(hMap.containsKey("FeesPaid")) {
				 count = hMap.get("FeesPaid");
				count++;
			}
			else
				count=1;
			
			hMap.put("FeesPaid", count);
			}
			else {
				if(hMap.containsKey("FeesNotPaid")) {
					 count = hMap.get("FeesNotPaid");
					count++;
				}
				else
					count=1;
				
				hMap.put("FeesNotPaid", count);
			}
			}
		System.out.println(hMap);
	}
		}
