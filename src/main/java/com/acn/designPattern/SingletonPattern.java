package com.acn.designPattern;

public class SingletonPattern {
	public static final SingletonPattern singleInstance=createInstance();
	
	
	private SingletonPattern() {
		
	}

	public static SingletonPattern createInstance() {
		System.out.println("##########"+singleInstance);
		if(singleInstance!=null) {
			return singleInstance;
		}else {
			System.out.println("1 Initialized at ruTime");
			return new SingletonPattern();
		}
		
	}
	
	//For client who want the object of SIngletonPattern
	public static SingletonPattern getInstance() {
		return singleInstance;
	}
	

}
