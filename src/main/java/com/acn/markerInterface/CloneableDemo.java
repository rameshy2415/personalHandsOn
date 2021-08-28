package com.acn.markerInterface;

public class CloneableDemo implements Cloneable{
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	public CloneableDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

}
