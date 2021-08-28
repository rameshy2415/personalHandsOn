package org.acn.interfaceAbstract;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Predicate;

import org.acn.thread.SynchronizedDemo;
import org.acn.thread.ThreadClass;
import org.acn.thread.ThreadClassRunnable;

/**
 * Hello world!
 *
 */
public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		
		
		/*ThreadClass tc = new ThreadClass();
		tc.start();*/

		// ThreadClassRunnable r = new ThreadClassRunnable();//obj of Implemented class
		/*
		 * Runnable r = new ThreadClassRunnable();//Refrence of Runnable Interface
		 * Thread t1 = new Thread(r);
		 * t1.start();
		 */

		// Using Lambda Expression and Inner class
		/*Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello Thread  Class implements Runnable interface");
				System.out.println("Current Thread Nmae in Tread Class-->" + Thread.currentThread().getName());
			}

		};
		Thread t1 = new Thread(r);
		t1.start();*/

		// System.out.println("Current Thread
		// Nmae-->"+Thread.currentThread().getName());

		// Synchronized Demo using inner Class
		SynchronizedDemo sd = new SynchronizedDemo();

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 100000; i++) {
				sd.increment();
			}

		});
		
		
		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 100000; i++) {
				sd.increment();
			}

		});
		
		
		t2.start();
		t3.start();
		
		
		t2.join();
		t3.join();
		System.out.println("Counter Value==>"+sd.counter);
		
		//Creating Thread using ExecutorService
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0;i<=9;i++) {
			ThreadClassRunnable r = new ThreadClassRunnable();
			service.execute(r);
		}
		
		//Functional programming (i.e Consise )
		Predicate<Integer> p= i->i%2==0;
		System.out.println(p.test(4));
		
		Function<Integer, Integer> f=i->i*i;
		System.out.println("The Square of Number 40: "+f.apply(40));
	}
}
