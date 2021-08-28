package com.acn.functionalInterface;

public class HandsOnInterfaceImpl implements TestInt, TestInt1, HandsOnInterface{

	public void testMethod() {
        System . out . println ( "m is "+ TestInt1.m );   
         System . out . println ( "Hi World!" );    
    }

}


class MainClass{
public static void main(String[] args) {
	HandsOnInterfaceImpl impl = new HandsOnInterfaceImpl();
	impl.testMethod();
	System.out.println(impl.name);

	}
}
