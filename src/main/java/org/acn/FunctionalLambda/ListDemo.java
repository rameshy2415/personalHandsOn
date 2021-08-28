package org.acn.FunctionalLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
	public void listDemo() {
		List<Integer> list = new ArrayList<>();
		Integer[] arr = new Integer[] { 1, 4, 2, 8, 3 };
		list = Arrays.asList(arr);
		list.forEach(i->System.out.println(i));
		
		List<Integer> list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list2);

	}

}
