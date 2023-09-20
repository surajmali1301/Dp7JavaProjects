package com.LabSession_Containment;

class Car {

	int modelNo;
	String carName;
	Machine m;

	Car() {

	}

	Car(int modelNo, String carName, Machine m) {
		this.modelNo = modelNo;
		this.carName = carName;
		this.m = m;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setM(Machine m) {
		this.m = m;
	}

	public Machine getM() {
		return m;
	}

	public String toString() {
		return "CarModelNo: " + modelNo + " carName: " + carName + "\nMachineDetails" + m;
	}

}
