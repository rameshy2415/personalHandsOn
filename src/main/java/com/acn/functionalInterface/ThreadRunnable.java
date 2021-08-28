package com.acn.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ThreadRunnable implements Runnable{
	@Override
	public void run() {
		long startTime = System.nanoTime();
		Random r = new Random();
		List<Integer> list=new ArrayList<>();
		for(double i=1;i<=100000;i++) {
			Integer nu=r.nextInt(1000);
			list.add(nu);
		}
		list.stream().forEach(i->System.out.println(" "+i+" "));
				
		
		
		List<Integer> list2=new ArrayList<>();
		for(double i=1;i<=100000;i++) {
			Integer nu=r.nextInt(1000);
			list2.add(nu);
		}
		list.stream().forEach(i->System.out.println(" "+i+" "));
		
		System.out.println("Size of the List: "+list.size());
				
		System.out.println("Size of the List2: "+list.size());
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		/*System.out.println("*****************Start Time********************: "+startTime);
		System.out.println("*****************End Time**********************: "+endTime);
		System.out.println("*****************Total Time*********************: "+totalTime);*/
	}
	

}
