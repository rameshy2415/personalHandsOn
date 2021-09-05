/*
 * Creation : 25 Jun 2021
 */
package com.acn.tryCatchDemo;

/**
 * @author ramesh
 *
 */
public class TryCatchDemo { 
    public static void main(String args[]) {
        String val = getValue();
        System.out.println(val);
    }

    public static String getValue() {
        int i = 9;
        try {
        	int sum = 1/0;
            return "from try";
            
        } catch (Exception e) {
            return "from Catch";
        } finally {
            
           // System.out.println("Hello");
            return "from finally";
        }
        // return "ajjd"; // Leads to compile time error
    }

}
