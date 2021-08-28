package com.acn.designPattern;

public class MainClass {

    public static void main(String[] args) {

        // Getting instance using Builder Pattern
        Computer comp = new Computer.ComputerBuilder().setGraphic(true).setHdd("500GB").setRam("2GB").build();
        System.out.println(comp);

        // getting instance using Singleton design pattern
        System.out.println("2 Step");
        SingletonPattern instance = SingletonPattern.getInstance();
        System.out.println(instance.hashCode());

        // Example using Strategy design pattern
        /*
         * Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at
         * runtime.
         */
        Cart cart = new Cart();
        Item item1 = new Item("1234", 50);
        Item item2 = new Item("4567", 80);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.paying(new PaypalPayment("ramesh", "hdhdh"));
        cart.paying(new DebitcardPayment("74848484", "373", "242020"));

    }

}
