package in.prec.java8features.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class MainStreamApi {
	public static void main(String[] args) {
//		Integer[] intArray = {1,2,3,4,5,6,8,9,10,12,14};
////		Arrays.stream();
//		Stream<Integer> intStream=Arrays.stream(intArray);
		
//		Stream.of(T... t)
//		Stream.of(1,2,3,4,5);
		
//		filter<Predicate<T> p)   forEach(Consumer<T> c)
		
//		intStream.filter(e->e%2!=0).forEach(e->System.out.println(e));
//		
//		intStream.forEach(System.out::println);
		
//		intStream
//			.filter(e->e%2==0)
//			.filter(e->e>5)
//			.forEach(e->System.out.println(e));
		
		
//		Map(Function<T,U> m)
		
//		intStream.map(e->e+"").forEach(e->System.out.println(e.length()));
		
//		intStream.close();
		
		
		Stream<String> strStream=Stream.of("Priti", "Nikita", "Sanika", "Anjali", "Diksha", "Om", "Usha");
		
//		strStream.map(e->e.length()).filter(e->e%2==0).forEach(e->System.out.println(e));
		
		strStream
			.map(e->e.length())
			.filter(e->e%2==0)
			.distinct()
			.sorted()
			.peek(e->System.out.println(e))
			.forEach(e->System.out.println(e));
		
		
		strStream.close();
	}

}
