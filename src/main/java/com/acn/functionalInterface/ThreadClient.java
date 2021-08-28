package com.acn.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadClient {
    static long startTime;
    static long endTime;
    static long totalTime;

    public static void main(String[] args) throws InterruptedException {

        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        startTime = System.nanoTime();

        // Normal calling a run method
        for (int i = 1; i <= 10; i++) {
            ThreadRunnable td = new ThreadRunnable();
            td.run();
        }

        for (int i = 1; i <= 10; i++) {
            // Creating Execotor service by using service executing the Thread
            service.execute(new ThreadRunnable());

            // Creating Thread and calling start method of Traditional way
            /*
             * Thread t = new Thread(new ThreadRunnable()); t.start();
             */
        }

        List<Future> futureValue = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Future<Integer> future = service.submit(new ThreadCallable());
            futureValue.add(future);

        }

        for (int i = 1; i <= 10; i++) {
            try {
                Future<Integer> future = futureValue.get(i);
                Integer result = future.get();
                System.out.println("Result of future #" + i + " " + result);
            } catch (Exception e) {

            }

        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;

        System.out.println("*****************Start Time********************: " + startTime);
        System.out.println("*****************End Time**********************: " + endTime);
        System.out.println("*****************Total Time*********************: " + totalTime);
        service.shutdownNow();

    }

}
