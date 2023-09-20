package com.containment_Assignment;

public class Topic {

	public int topicId;
	public String tName;
	SubTopic st;

	Topic() {

	}

	Topic(int id, String name, SubTopic st) {
		topicId = id;
		tName = name;
		this.st = st;
	}

	public void setSubTopic(SubTopic st) {
		this.st = st;
	}

	public void showTopic() {
		System.out.println("Topic Id: " + topicId);
		System.out.println("Topic Name: " + tName);
		st.showSubTopic();
	}
}
