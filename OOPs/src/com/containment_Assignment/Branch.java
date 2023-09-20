package com.containment_Assignment;

public class Branch {

	int bId;
	String bName;
	Subject sub;
	
	Branch(){
		
	}
	Branch(int bId,String bName,Subject sub){
		this.bId=bId;
		this.bName=bName;
		this.sub=sub;
	}
	public void setSubject(Subject sub) {
		this.sub=sub;
	}
	
	public void showBranch() {
		System.out.println("Brach Id: "+bId);
		System.out.println("Brach name: "+bName);
		sub.showSubject();
	}
}
