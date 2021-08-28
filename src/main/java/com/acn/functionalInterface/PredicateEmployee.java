package com.acn.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEmployee {

	public static void main(String[] args) {
	List<Employee> eList= new ArrayList<Employee>();
	eList.add(new Employee("Ramesh",5000));
	eList.add(new Employee("Prakash",6000));
	eList.add(new Employee("Puja",8000));
	eList.add(new Employee("Punam",3000));
	eList.add(new Employee("Suman",2000));
	
	Predicate<Employee> p= emp -> emp.salary>5000;
	Predicate<Employee> p1= emp1 -> emp1.name.length()>4;//we can use more than two predicate
	for(Employee emp1:eList) {
		if(p.and(p1).test(emp1)) {
			System.out.println(emp1.name+"-->"+emp1.salary);
		}
	}

	}

}
