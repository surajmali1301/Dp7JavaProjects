package com.MultiThreading;

public class PrintingNumbersThread extends Thread {
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

    public static void main(String[] args) {
    	PrintingNumbersThread thread1 = new PrintingNumbersThread();

        thread1.start();
    }
}
