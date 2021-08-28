package org.acn.FunctionalLambda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		/*FIDemo fd = (a, b) -> a + b;
		System.out.println("Sum of two number: " + fd.add(5, 9));

		Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("The Vlaue of: " + i);
			}
		};
		Thread t = new Thread(r);
		t.start();*/
		
		
		//ListDemo de= new ListDemo();
		//de.listDemo();
		
/*		Employee e= new Employee("Ramesh",16727496);
		Employee e1=(Employee) e.clone();
		System.out.println("Value of Object: e "+e +"HashCode"+e.hashCode());
		System.out.println("Value of Object: e1 "+e1+"HashCode"+e1.hashCode());
		System.out.println(e==e1);*/
		
		
		//Below example of hashCode and Equal method importance
		//we have override the hashCode and equal method in Employee to achieve Set property.
		//if we will not override same data will get added within the set.
		Employee e2= new Employee("Ramesh",16727496);
		Employee e3= new Employee("Ramesh",16727496);
		
		Set<Employee> set = new HashSet<>();
		set.add(e2);
		set.add(e3);
		System.out.println("Helllo");

	}

}
