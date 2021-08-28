package com.acn.streamAPI;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamDemo {

	public static void main(String[] args) throws IOException {
		Integer val=IntStream.range(1, 5).sum();
		System.out.println(val);
		
	System.out.println("Printing all the numbers");
	IntStream.range(1, 10).forEach(x->System.out.println(x));
	
	System.out.println("No which is skiped till five");
	IntStream.range(1, 10).skip(5).forEach(x->System.out.println(x));
	
	System.out.println("No which is less than five");
	IntStream.range(1, 10).filter(i->i<5).forEach(x->System.out.println(x));
	//IntStream.range(1, 10).map(i->i<5).forEach(x->System.out.println(x));
	
	System.out.println("*****Printing the String in Sorted order*******");
	Stream.of("XYZ","ABC","OPU").sorted().findFirst().ifPresent(System.out::println);
	
	System.out.println("*******Taking a Array of String filtering it Sorting it and finally Printing******");
	String[] arr= {"Sajnay","Ramesh","Sanjeev","Prakash","Sekhar"};
	Arrays.stream(arr).filter(x->x.startsWith("S")).sorted().collect(Collectors.toList()).forEach(System.out::println);
	
	System.out.println("*******Taking a Array of Integer squaring it Average it and finally Printing******");	
	Arrays.stream(new int[] {4,5,7,1,4,8,}).map(i->i*i).average().ifPresent(System.out::println);
	
	System.out.println("*******Taking a Array of String filtering it Sorting it and finally Printing******");
	String[] arr1= {"Sajnay","Ramesh","Sanjeev","Prakash","Sekhar"};
	List<String> list= Arrays.asList(arr1);
	list.stream().map(x->x.toLowerCase()).filter(x->x.startsWith("s")).sorted().forEach(System.out::println);
	
	
	System.out.println("*******Taking a Array of String filtering it Sorting it and finally Printing******");
	Stream<String> data=Files.lines(Paths.get("data.txt"));
	data.filter(i->i.length()>13).sorted().forEach(System.out::println);
	data.close();

	}

}
