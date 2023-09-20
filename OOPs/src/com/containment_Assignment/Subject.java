package com.containment_Assignment;

public class Subject {

	public int id;
	public String subName;
	Topic t;

	Subject() {

	}

	Subject(int id, String name, Topic t) {
		this.id = id;
		this.subName = name;
		this.t = t;
	}

	public void setTopic(Topic t) {
		this.t = t;
	}

	public void showSubject() {
		System.out.println("Subject id: " + id);
		System.out.println(" Subject Name: " + subName);
		t.showTopic();
	}

}
