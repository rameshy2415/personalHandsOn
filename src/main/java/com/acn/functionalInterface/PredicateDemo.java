package com.acn.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args)

	{
		String[] s = { "Ramesh", "Prakash", "Puja", "Punam" };
		Predicate<String> p = s2 -> s2.length() >5;
		for (String s1 : s) {
			if (p.test(s1)) {
				System.out.println(s1);
			}
		}

	}
}
