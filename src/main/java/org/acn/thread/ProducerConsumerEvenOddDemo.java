package org.acn.thread;

public class ProducerConsumerEvenOddDemo {

	public static void main(String[] args) {
		Utility u=new Utility();
		Odd o =new Odd(u);
		
		
		Even e =new Even(u);
	
	}

}
class Utility{
	boolean flag=false;
	int i;
	
	public synchronized void  setEven(int value) throws InterruptedException {
		while(flag) {
			wait();
		}
		
		//this.i=value;
		flag=true;
		System.out.println(value);
		Thread.sleep(2000);
		notify();
		
	}
	
	public synchronized void  setOdd(int value) throws InterruptedException {
		while(!flag) {
			wait();
		}
		
		//this.i=value;
		flag=false;
		System.out.println(value);
		notify();
		
	}
}

class Even implements Runnable{
	Utility u;
	

	public Even(Utility u) {
		this.u = u;
		Thread t = new Thread(this);
		t.start();
	}


	@Override
	public void run() {
	int i=0;
		while(true) {
			try {
				u.setEven(i);
				i+=2;
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}

class Odd implements Runnable{
	Utility u;
	

	public Odd(Utility u) {
		this.u = u;
		Thread t = new Thread(this);
		t.start();
	}


	@Override
	public void run() {
		int i=1;
		while(true) {
			try {
				u.setOdd(i);
				i+=2;
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}
