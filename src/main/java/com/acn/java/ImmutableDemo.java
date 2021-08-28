/*
 * Creation : 11 Jul 2021
 */
package com.acn.java;

public final class ImmutableDemo {
    public static void main(String args[]) throws CloneNotSupportedException {

        Address address = new Address("123456", "Koderma");
        EmployeeDemo ed = new EmployeeDemo("Ramesh", 1, address);
        System.out.println(ed);

        ed.getAddress().setPin("000000");
        ed.getAddress().setStreet("XYZ");

        System.out.println(ed);

    }

}

final class EmployeeDemo {
    private final String name;
    private final int id;
    private final Address address;

    public EmployeeDemo(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

    @Override
    public String toString() {
        return "EmployeeDemo [name=" + name + ", id=" + id + ", address=" + address + "]";
    }

}

class Address implements Cloneable {
    private String pin;
    private String street;

    public Address(String pin, String street) {
        this.pin = pin;
        this.street = street;
    }

    public String getPin() {
        return pin;
    }

    public String getStreet() {
        return street;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address [pin=" + pin + ", street=" + street + "]";
    }

}
