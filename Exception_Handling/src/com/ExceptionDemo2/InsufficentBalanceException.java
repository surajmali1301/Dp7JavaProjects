package com.ExceptionDemo2;

public class InsufficentBalanceException extends RuntimeException{

	public InsufficentBalanceException() {
		super();	
	}

	public InsufficentBalanceException(String message) {
		super(message);
	}

	
}
