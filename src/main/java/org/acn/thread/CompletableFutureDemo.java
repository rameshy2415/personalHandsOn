/*
 * Creation : 17 Jul 2021
 */
package org.acn.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().map(n -> CompletableFuture.supplyAsync(() -> getNo(n))).map(CompletableFuture -> CompletableFuture.thenApply(i -> i * i))
                .map(t -> t.join()).forEach(i -> System.out.println(i));

    }

    public static int getNo(int n) {
        System.out.println("number " + n);
        return n * n;
    }

}
