package org.acn.thread;

public class ThreadClassRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello Thread  Class implements Runnable interface");
			//System.out.println("Current Thread Nmae in Tread Class-->" + Thread.currentThread().getName());
		}

	}

}
