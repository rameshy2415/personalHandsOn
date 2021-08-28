package com.acn.functionalInterface;

public class AbstractDemo extends demo {

	public void set(int a) {
		this.a = a;
	}

	final public void get() {
		System.out.println("a = " + a);
	}
	public static void main(String[] args) 
	{ 
		AbstractDemo obj = new AbstractDemo(); 
		obj.set(20); 
		obj.get(); 
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		
	}



}


abstract class demo {
	public int a=40;;

	demo() {
		a = 10;
	}

	abstract public void set();

	abstract public void get();

}
