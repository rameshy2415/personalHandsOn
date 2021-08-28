package com.acn.functionalInterface;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n=10;
		System.out.println("Decimal Number: "+n);
		String[] array =new String[4];
		int i=0;
		int rem=0;
		while(n>0) {
			rem=n%2;
			array[i]=Integer.toString(rem);
			i++;
			n=n/2;
			
		}
		
		for (int j=(array.length-1);j>=0;j--) {
			System.out.print(array[j]);
		}

	}

}
