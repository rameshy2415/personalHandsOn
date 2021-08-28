package org.acn.FunctionalLambda;

import java.util.stream.IntStream;

public class StreamDemo {
	private static String[] x;

	public static void main(String[] args) {
		

		
		
		/*A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
		Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
		Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate
		operations can be pipelined. Terminal operations mark the end of the stream and return the result.*/
		/*try {
			IntStream.of(1, 2, 3, 5, 6, 7).filter((int i) -> i % 2 == 0).forEach(System.out::println);
		}catch(ArithmeticException | ClassCastException | NullPointerException  e) {
			
		}catch(Exception e) {
			
		}*/
		
		System.out.println(x[0]);
		
	}

}
