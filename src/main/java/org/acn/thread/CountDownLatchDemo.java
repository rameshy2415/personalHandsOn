/*
 * Creation : 12 Jul 2021
 */
package org.acn.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*When we create an object of CountDownLatch, we specify the number of threads it 
 * should wait for, all such thread are required to do count down by calling CountDownLatch.countDown() 
 * once they are completed or ready to the job. As soon as count reaches zero, the waiting task starts running*/

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService service = Executors.newFixedThreadPool(5);
        Thread t1 = new Thread(new LatchThread(latch));
        Thread t2 = new Thread(new LatchThread(latch));
        Thread t3 = new Thread(new LatchThread(latch));
        t1.start();
        t2.start();
        t3.start();
        latch.await();
        System.out.println("Main Thread Completed");

    }

}

class LatchThread implements Runnable {
    private CountDownLatch latch;

    LatchThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " Started");
        latch.countDown();

    }
}
