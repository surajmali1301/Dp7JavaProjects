package com.MultiThreading;

public class PrintingNumbersRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 100; i <= 200; i++) {
//			System.out.println(i);
			try {
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		PrintingNumbersRunnable t1 = new PrintingNumbersRunnable();

		Thread t = new Thread(t1);
		t.start();
	}
}
