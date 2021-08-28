/*
 * Creation : 17 Jun 2021
 */
package com.acn.java;

public class VarArgsExample {

    public static void main(String[] args) {

        add();
        add(10, 17);
        add(10, 17, 20);
    }

    /* any no of parameter we can pass in the method Arguments with similar data type */
    public static void add(int... a) {

        for (int i : a) {
            System.out.println(i);
        }
    }

}
