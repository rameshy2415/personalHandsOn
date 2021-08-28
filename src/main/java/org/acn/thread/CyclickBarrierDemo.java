/*
 * Creation : 12 Jul 2021
 */
package org.acn.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclickBarrierDemo implements Runnable {
    public static CyclicBarrier cb = new CyclicBarrier(3);

    public static void main(String args[]) {

        Thread t = new Thread(new CyclickBarrierDemo());
        t.start();

    }

    @Override
    public void run() {
        try {
            System.out.println("sum " + (Computation1.sum + Computation2.product));
            Thread t1 = new Thread(new Computation1(cb));
            Thread t2 = new Thread(new Computation2(cb));
            t1.start();
            t2.start();
            CyclickBarrierDemo.cb.await();
            System.out.println("sum " + (Computation1.sum + Computation2.product));
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

}

class Computation1 implements Runnable {
    public static int sum = 0;

    CyclicBarrier cb;

    Computation1(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        sum = 10;
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

}

class Computation2 implements Runnable {
    public static int product = 0;

    CyclicBarrier cb;

    Computation2(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            product = 5;
            cb.await();

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

}
