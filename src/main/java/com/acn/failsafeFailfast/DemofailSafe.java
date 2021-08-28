/*
 * Creation : 28 Jul 2021
 */
package com.acn.failsafeFailfast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class DemofailSafe {

    public static void main(String args[]) {
        ArrayList<String> list = (ArrayList<String>) Arrays.asList("Ramesh", "rakash");

        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.set("Hello");
        }

        Iterator<String> itr1 = list.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr.next());

            if (itr1.next().equals("Ramesh")) {
                itr1.remove();
            }

        }
    }

}
