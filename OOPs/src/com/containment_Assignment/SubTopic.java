package com.containment_Assignment;

public class SubTopic {

	public int sTopicId;
	public String sTName;
	 Question qt;
	 
	 SubTopic(){
		 
	 }
	
	SubTopic(int sId,String sName,Question q){
		sTopicId=sId;
		sTName=sName;
		qt=q;
		
	}
	public void setQuestion(Question q) {
		qt=q;
	}
	public void showSubTopic() {
		System.out.println("Sub Topic: "+sTopicId);
		System.out.println("Sub Topic Name: "+sTName);
		qt.showQuestions();
	}
}
