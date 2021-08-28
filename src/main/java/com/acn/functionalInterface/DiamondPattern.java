package com.acn.functionalInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) throws ParseException {
		String o1= "String";  //new Object();
		String o2= "String"; //new Object();
		String o3=new String("String");
		System.out.println(o1.equals(o3));
		System.out.println(o1==o2);
		System.out.println(o1==o3);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date date= new Date();
		String striDate=sdf.format(date);
		System.out.println("Today ==>"+date);
		System.out.println("String -->"+striDate);
		Date date1=sdf.parse(striDate);
		System.out.println(date1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		System.out.print("Enter Symbol : ");

		char c = sc.next().charAt(0);
		boolean flag = pattern(n,c);
		System.out.println(flag);

	}

	public static boolean pattern(int n,char c) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k < (i * 2); k++) {
				System.out.print(c);
			}
			System.out.println();
		}
		int counter = 0;
		System.out.print(" ");

		for (int i = (n - 1); i >= 1; i--) {
			counter++;

			for (int j = 1; j <= counter; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k < (i * 2); k++) {
				System.out.print(c);
			}

			System.out.println();
		}
		return true;

	}

}
