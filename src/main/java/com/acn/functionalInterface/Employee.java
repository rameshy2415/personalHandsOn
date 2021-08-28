package com.acn.functionalInterface;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	public String name;
	public int salary;
	public int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, int salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Employee() {

	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		
		return (int) (this.name.compareTo(o.getName()));
	}

	/*@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getAge()-o2.getAge());
	}*/

}
