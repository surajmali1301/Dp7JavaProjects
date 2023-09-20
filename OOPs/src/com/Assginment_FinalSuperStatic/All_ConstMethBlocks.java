package com.Assginment_FinalSuperStatic;

class AllConstMethBlock {

    static int staticVariable = 10;
    int instanceVariable;

    // Static block
    static {
        System.out.println("Static block executed");
        staticVariable = 20;
    }

    // Default constructor
    public AllConstMethBlock() {
        System.out.println("Default constructor executed");
        instanceVariable = 30;
    }

    // Parameterized constructor
    public AllConstMethBlock(int value) {
        System.out.println("Parameterized constructor executed with value: " + value);
        instanceVariable = value;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method executed");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method executed");
        System.out.println("Instance variable value: " + instanceVariable);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // Calling static method
        staticMethod();

        // Creating objects
        AllConstMethBlock obj1 = new AllConstMethBlock();
        AllConstMethBlock obj2 = new AllConstMethBlock(50);

        // Calling instance method
        obj1.instanceMethod();
        obj2.instanceMethod();

        System.out.println("Main method ended");
    }
}

public class All_ConstMethBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
