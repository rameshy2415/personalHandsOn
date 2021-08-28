package com.acn.functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSolution {
	public static void main(String args[]) {
		Employee e1 = new Employee("Ramesh", 9000, 28);
		Employee e2 = new Employee("Husan", 6000, 23);
		Employee e3 = new Employee("Amesh", 8000, 78);
		Employee e4 = new Employee("Prakash", 1000, 20);
		Employee[] eArray= {e1,e2,e3,e4};
		List<Employee> eList = Arrays.asList(eArray);
		

	/*	Comparator<Employee> c =new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
				
				return (o1.getAge()-o2.getAge());//sort on the basis of age
				//return o1.getName().compareTo(o2.getName());//sort on the basis of Name
			}

		};
		eList.sort(c);
		*/
		
		
		//Below Statement used Lambda expression
	
		Comparator<Employee> c =( o1, o2) ->(o1.getAge()-o2.getAge());

		eList.sort(( o1, o2) ->(o1.getAge()-o2.getAge()));
		
		
		//Collections.sort(eList);
		System.out.println("========Sorting Using Comparator Interface based on AGE =========");
		eList.forEach(i->System.out.println(i.getName()+" "+i.getSalary()+" "+i.getAge()));
		
		
		
		System.out.println("========Sorting Using Comparable Interface based on NAME =========");
		List<Employee> eList1 = Arrays.asList(e1, e2, e3, e4);
		Collections.sort(eList1);
		eList1.stream().forEach(i->System.out.println(i.getName()+" "+i.getSalary()+" "+i.getAge()));
		
		

	}
}
