package com.LabSession;

public class OutOfRangeException extends Exception {

	public OutOfRangeException() {
		super();

	}

	public OutOfRangeException(String message) {
		super("Number is Out of Range");

	}

}
