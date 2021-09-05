package com.acn.java;

public class EqualsDoubleEquals {

	public static void main(String[] args) {

		String s = new String("hello");
		String s1 = new String("hello");
		try {
			if (s1 == s) {
				System.out.println("0");
			}
			if (s == "hello") {
				System.out.println("1");
			}
			if (s.equals("hello")) {
				System.out.println("2");
			}
			System.out.println("works!1");

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

		Object o = new Object();
		o = "Tom";
		print(o);

	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	
	public static void print(String o) {
		System.out.println(o);
	}

}
