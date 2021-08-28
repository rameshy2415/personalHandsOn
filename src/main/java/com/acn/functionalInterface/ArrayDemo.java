package com.acn.functionalInterface;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5,6,7,8};
		String[] a2= {"A","B","C","D"};
		int l1=a1.length;
		int l2=a2.length;
		int count=0;
		if(l1>l2) {
			for(int i=0;i<l2;i++) {
				System.out.print(a1[i]+","+a2[i]+",");
				if(count==l2) {
					break;
				}
				count++;
				
				/*for(int j=0;j<l2;j++) {
					System.out.println(a1[j]+a2[j]);
					
				}*/
			}
			for(int cout=l2;cout<l1;cout++) {
				System.out.print(a1[cout]+",");
				
			}
		}

	}

}
