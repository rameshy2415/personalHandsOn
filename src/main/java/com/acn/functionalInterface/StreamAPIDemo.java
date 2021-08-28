package com.acn.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamAPIDemo {

	public static void main(String[] args) {
		String arr[] = {"Ramesh", "Yadav", "Amesh", "Lakhan"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int ar[]= {4,1,6,10,3};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		
		List<String> list= new ArrayList<String>();
		List<String> list1=(List<String>)Arrays.asList("Ram","Yht","Avi","Bvi");
	    Collections.sort(list1);
	    list1.forEach(i->System.out.print(i+"  "));
	}
}
