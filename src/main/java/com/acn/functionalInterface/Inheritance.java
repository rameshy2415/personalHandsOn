package com.acn.functionalInterface;

public class Inheritance {

	public static void main(String[] args) {

		Parent obj1 = new Parent();//can access only parent method
		Parent obj2 = new Child();//can access only parent method
		//Child child = new Child();//child object can access all method parent as well as Implemented
		//MyInterface myIn = new Child();//myIn can access only implemented method
		//Child ch1=(Child) new Parent();//can access all method 	

		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
		System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
	}
}

	class Parent {
		public void parent() {
			System.out.println("Inside Parent method");
		}

	}

	interface MyInterface {
		public void interMethod();

	}

	class Child extends Parent implements MyInterface {
		public void child() {
			System.out.println("Inside child method");
		}

		@Override
		public void interMethod() {
			System.out.println("Implemented method");
			
		}

	}

