/*
 * Creation : 28 Jul 2021
 */
package com.acn.polymorphism;

public class Overloading {
    int x;

    public static void main(String[] args) {
        // int x = 10;
        Integer.parseInt("123");
        Overloading o = new Overloading();
        modify(o);
        System.out.println(o.x);

    }

    public static void modify(Overloading o) {
        o.x = 20;
    }

}

class OverLoaddingDemo {
    public void add(int x, int y) {
        System.out.println(x + y);

        Integer.parseInt("123");
    }

    // Will produce compile time error
    /*
     * public int add(int x, int y) { return x + y; }
     */
}
