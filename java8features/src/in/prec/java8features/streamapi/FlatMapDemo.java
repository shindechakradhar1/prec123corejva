package in.prec.java8features.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
//		int[][] intArray = {{1,2,3},{4,5,6},{7,8,9}};
//		
//		IntStream intStream = Arrays.stream(intArray).flatMapToInt(e->Arrays.stream(e));
		
		Integer[][] intArray = {{1,2,3},{4,5,6},{7,8,9}};
		
		Stream<Integer> intStream=Arrays.stream(intArray).flatMap(e->Arrays.stream(e));
		
		intStream.filter(e->e%2==0).forEach(e->System.out.println(e));
		intStream.close();
	}
}
