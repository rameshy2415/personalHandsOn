package com.acn.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListDEmo {

	public static void main(String[] args) {
		
		int coreCount=Runtime.getRuntime().availableProcessors();
		ExecutorService service =Executors.newFixedThreadPool(coreCount);
		
		
		long startTime = System.nanoTime();
		Random r = new Random();
		List<Integer> list=new ArrayList<>();
		//List<Integer> list = new LinkedList<>();
		//Vector<Integer> list = new Vector<>();
		//list=Arrays.asList(40,10,60,50);
		for(double i=1;i<=100000;i++) {
			Integer nu=r.nextInt(1000);
			list.add(nu);
		}
		list.stream().forEach(i->System.out.println(" "+i+" "));
		
		int[] arr= new int[list.size()];
		for(int i=0; i<arr.length;i++) {
			arr[i]=list.get(i);
		} 
		
		Arrays.sort(arr);
		for(int a: arr) {
			System.out.println(a);
		}
				
		//list.stream().forEach(i->System.out.println("Before Removing: "+i));
		
		
		//System.out.println("Size of the List before Removing: "+list.size());
		
		
		int size=list.size();
		for(int i=size-1;i>=0;i--) {
			list.remove(i);
		}
		
		
		System.out.println("Size of the List after removing: "+list.size());
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("*****************Start Time********************: "+startTime);
		System.out.println("*****************End Time**********************: "+endTime);
		System.out.println("*****************Total Time*********************: "+totalTime);

	}
	
	 

}
