package com.acn.functionalInterface;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemoList extends Thread{
	static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();//Fail safe 
	//static ArrayList<Integer> list = new ArrayList<>();//Fail fast//Exception java.util.ConcurrentModificationException
	public void run() {
		list.add(20);
	}

	public static void main(String[] args) throws InterruptedException {
		
		list.add(10);
		list.add(30);
		list.add(40);
		ConcurrentDemoList obj = new ConcurrentDemoList();
		obj.start();
		//Thread.sleep(1000);
		for(Integer l:list) {
			System.out.println(l);
			//Thread.sleep(1000);
		}
		System.out.println(list);


	}

}
