/*
 * Creation : 22 Jun 2021
 */
package com.acn.inheritence;

public class InheritenceCovarientDemo {

    public static void main(String args[]) {
        Parent c = new Child();
        c.m1();
        c.covarient();
        int count = 0;

        Integer arr[] = { 1, 2, 3, 4, 5, 6 };

        try {
            while (true) {
                int x = arr[count];
                count++;
            }

        } catch (Exception e) {
            System.out.println(count);
        }
    }

}

class Child extends Parent {

    public void m1() {
        System.out.println("Child M1");
    }

    public Parent covarient() {
        System.out.println("Child covarient");
        return this;
    }

}

class Parent {
    public void m1() {
        System.out.println("Parent M1");
    }

    public Parent covarient() {
        System.out.println("Parent covarient");
        return this;
    }
}
