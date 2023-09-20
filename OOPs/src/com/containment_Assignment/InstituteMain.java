package com.containment_Assignment;
import java.util.*;
public class InstituteMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id: ");
		int id = sc.nextInt();
		System.out.println("Enter institute name: ");
		String name = sc.next();
		
		System.out.println("Enter the Branch id: ");
		int bId = sc.nextInt();
		System.out.println("Enter the branch name: ");
		String bName = sc.next();
		
		System.out.println("Enter the subject Id: ");
		int sid = sc.nextInt();
		System.out.println("Enter the subject Name: ");
		String sName = sc.next();
		
		System.out.println("Enter the Topic Id: ");
		int tId = sc.nextInt();
		System.out.println("Enter the topic name: ");
		String tName = sc.next();
		
		System.out.println("Enter the subTopic Id: ");
		int stId = sc.nextInt();
		System.out.println("Enter the subTopic Name: ");
		String stName = sc.next();
		
		System.out.println("Enter the Question Id: ");
		int qId = sc.nextInt();
		System.err.println("Enter the Question Name: ");
		String qName = sc.next();
		
		Question q = new Question(qId,qName);
		SubTopic st = new SubTopic(stId,stName,q);
		Topic t = new Topic(tId,tName,st);
		Subject sub  = new Subject(sid,sName,t);
		Branch b = new Branch(bId,bName,sub);
		Institute i = new Institute(id,name,b);
		
		i.showInstitute();

	}

}
