package com.CollectionMasterAssignment;
//10. Output of LinkedList program
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q_10LinkedList {

	  public static void main(String[] args) {
	        LinkedList<String> ll = new LinkedList<String>();
	        ll.add("Jan");
	        ll.add("Feb");
	        ll.add("Apr");
	        ll.add("Jan");
	        Collections.sort(ll);
	        ListIterator itr = ll.listIterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	        ll.add(2,"August");
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	  }
}
