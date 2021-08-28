/*
 * Creation : 26 Jul 2021
 */
package com.acn.equalsHashCode;

public class EqualsDemo {

    public static void main(String[] args) {
        EqualsDemo ed = new EqualsDemo();
        EqualsDemo ed1 = new EqualsDemo();
        System.out.println(ed.equals(ed1));

    }

    public boolean equals(Object o) {
        return (this != o);
    }

}
