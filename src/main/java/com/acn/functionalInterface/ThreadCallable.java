package com.acn.functionalInterface;

import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<Integer>{
	 Random r = new  Random();

	@Override
	public Integer call() throws Exception {		
		return r.nextInt(1000);
	}

}
