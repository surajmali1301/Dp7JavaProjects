package com.LabSession_Containment;

class Machine {

	String machineType;
	Engine engine;

	Machine() {

	}

	Machine(String machineType, Engine e) {
		this.machineType = machineType;
		this.engine = engine;
	}

	public String getMachineType() {
		return machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
