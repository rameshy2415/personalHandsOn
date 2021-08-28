/*
 * Creation : 25 Jun 2021
 */
package com.acn.tryCatchDemo;

public class TryCatchDemo {

    public static void main(String args[]) {
        String val = getValue();
        System.out.println(val);
    }

    public static String getValue() {
        int i = 9;
        try {
            return "from try";
        } catch (Exception e) {
            return "from Catch";
        } finally {
            return "from finally";
        }
        // return "ajjd"; // Leads to compile time error
    }

}
