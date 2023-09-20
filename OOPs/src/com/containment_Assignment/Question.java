package com.containment_Assignment;

public class Question {

	public int qId;
	public String qName;
	
	Question(){
		
	}
	Question(int id,String name){
		qId=id;
		qName=name;
	}
	
	public void showQuestions() {
		System.out.println("Question Id: "+qId);
		System.out.println("Question Name: "+qName);
	}
}
