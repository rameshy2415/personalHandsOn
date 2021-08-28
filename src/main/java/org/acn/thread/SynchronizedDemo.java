package org.acn.thread;

public class SynchronizedDemo {
	public int counter;
	public synchronized void increment() {
		counter++;
	}

}
