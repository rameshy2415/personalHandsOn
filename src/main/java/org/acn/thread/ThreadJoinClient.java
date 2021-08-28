/*
 * Creation : 17 Jun 2021
 */
package org.acn.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadJoinClient {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            ThreadJoin b = new ThreadJoin();
            b.setName("name " + i);
            Future<String> futureObject = es.submit(b);
            Future<String> futureObject1 = es.submit(b);
            System.out.println(futureObject.get());
        }

        System.out.println("Completed");

    }

}
