package org.acn.thread;


//extends Thread class
public class ThreadClass extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello Thread  Class");
			//System.out.println("Current Thread Nmae in Tread Class-->"+currentThread().getName()); 
		}
	}

}
