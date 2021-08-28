package com.acn.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		int n = 8;
		System.out.println("====================Square=======================\n\n");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");

		}

		System.out.println("====================Triangle=======================\n\n");

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================Triangle=====================\n\n");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================PyraMid==========================\n\n");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Logic is if(row=column) SOP(*) else if(row+column=(n+1)) SOP(*) else SOP ("
		// ")
		System.out.println("====================X Pattern======================\n\n");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print("#");
				} else if (i + j == 9) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}
		System.out.println("=====================Fibonacci Series======================\n\n");
		int ist = 0;
		int nd = 1;
		List<Integer> fiboList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			// System.out.println(ist);
			fiboList.add(ist);
			int sum = ist + nd;
			ist = nd;
			nd = sum;
		}
		System.out.println(fiboList);
		
		System.out.println("=====================Bubble Sort======================\n\n");
		Integer[] array = {4,7,2,6,8,9};
		int length=array.length;
		int temp=0;
		
		for (int i = 0; i<length; i++) {
			for(int j=1;j<(length-1);j++) {
				if(array[j-1]>array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					
				}
			}
			
		}
		List<Integer> lArray=Arrays.asList(array);
		System.out.println(lArray);
		System.out.println("===========================================\n\n");

		Student[] st = { new Student("Ramesh", 90), new Student("Praksh", 50) };

		Integer[] arr = { 5, 7, 9, 2, 0 };
		List<Integer> list = Arrays.asList(arr);
		list.forEach(i -> System.out.println(i * i));

		Function<Student, String> f = s -> {
			int marks = s.mark;
			String grade;
			if (marks > 80)
				return "A grade";
			else
				return "failed";

		};
		for (Student s : st) {
			System.out.println("Name-->" + s.name + " Grade-->" + f.apply(s));
		}

	}

}
