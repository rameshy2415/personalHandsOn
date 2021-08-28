/*
 * Creation : 24 Aug 2021
 */
package com.acn.inheritence;

public class InheritenceExample {

    public static void main(String[] args) {
        C c = new C();

        P p = new C();

    }

}

class C extends P {
    C() {
        System.out.println("CCC".toCharArray());
    }
}

class P {
    P() {
        System.out.println("PPP");
    }
}
