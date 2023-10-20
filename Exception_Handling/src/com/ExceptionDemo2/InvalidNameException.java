package com.ExceptionDemo2;

public class InvalidNameException extends RuntimeException{

	public InvalidNameException() {
		super();
	}
	public InvalidNameException(String message) {
		super(message);
	}
}
