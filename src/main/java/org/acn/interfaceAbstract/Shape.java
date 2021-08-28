package org.acn.interfaceAbstract;

public interface Shape {
	public void draw();
	
	default void display() {
		System.out.println("Hello inteface");
	}

}
