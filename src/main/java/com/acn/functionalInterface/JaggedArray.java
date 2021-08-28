package com.acn.functionalInterface;

public class JaggedArray {

	public static void main(String[] args) {
	int arr[][]=new int[4][];
	arr[0]=new int[1];
	arr[1]=new int[2];
	arr[2]=new int[3];
	arr[3]=new int[4];
	int k=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<i+1;j++) {
			arr[i][j]=k;
			k++;
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<i+1;j++) {
			System.out.print(arr[i][j]);
			//k++;
		}
		System.out.println(" ");
	}

	}

}
