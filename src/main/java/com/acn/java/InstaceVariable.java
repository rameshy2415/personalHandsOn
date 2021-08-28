/*
 * Creation : 11 Jul 2021
 */
package com.acn.java;

public class InstaceVariable {

    public static void main(String[] args) {
        Demo d = new Demo("Ramesh", 1);
        System.out.println(d.getName());
        System.out.println(d.getId());
    }

}

class Demo {
    private String name;
    private int id;

    public Demo(String n, int i) {
        name = n;
        id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
