package com.acn.functionalInterface;

public class MinValue {

	public static void main(String[] args) {
		Integer arr[]= {10,70,20,90,4,60};
		Demo1 demo=new Demo1();
		demo.min(arr);

	}

}

class Demo1{
	public void min(Integer a[]) {
		
		/*List<Integer> aList=Arrays.asList(a);	
		aList.stream().forEach(action);*/
		Integer min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Min value "+min);
		
	}
}
