package com.LabSession_Containment;

class Engine {

	String engineType;
	float price;

	Engine() {

	}

	Engine(String engineType, float price) {
		this.engineType = engineType;
		this.price = price;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
