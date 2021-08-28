/*
 * Creation : 17 Jun 2021
 */
package org.acn.thread;

import java.util.UUID;
import java.util.concurrent.Callable;

public class ThreadJoin implements Callable<String> {
    private String name;

    @Override
    public String call() throws Exception {
        System.out.println(name);
        return Thread.currentThread().getName() + "  value: " + UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
