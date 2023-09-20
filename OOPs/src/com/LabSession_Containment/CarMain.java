package com.LabSession_Containment;

public class CarMain {

	public static void main(String[] args) {

		Car c1 = new Car();

		c1.setCarName("Safari");
		c1.setModelNo(2334);
		c1.setM(new Machine());
		c1.getM().setMachineType("TATA");
		c1.getM().setEngine(new Engine());
		c1.getM().getEngine().setEngineType("Petrol");
		c1.getM().getEngine().setPrice(1500000);

		System.out.println("CarName:" + c1.getCarName() + " ModelNo " + c1.getModelNo());
		System.out.println("MachineType: " + c1.getM().getMachineType());
		System.out.println("EngineType: " + c1.getM().getEngine().getEngineType());
		System.out.println("Price: " + c1.getM().getEngine().getPrice());

		System.out.println("---------------------------------------------------");
		Engine e = new Engine("Petrol",2000000f);
		Machine m = new Machine("Toyota",e);
		Car c2 = new Car(12345,"Fortuner",m);
//		System.out.println(c2);
	}

}
