package in.prec.java8features.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class TerminalFunctionDemo{

	public static void main(String[] args) {
//		Stream<String> nameStream = Stream.of("ABC","BBC","CBC","DBC","EBC");
//		count()
//		long count = nameStream.count();
//		System.out.println(count);
		
//		max
//		Optional<String> max=nameStream.max((e1,e2)->e1.compareTo(e2));
//		if(max.isPresent())
//			System.out.println(max.get());
		
//		min
//		Optional<String> min=nameStream.min((str1,str2)->str1.compareTo(str2));
//		min.ifPresent(e->System.out.println(e));
		
		
//		nameStream.close();
		
		Integer[] intArray = {1,2,3,4,5,6,7,8,9};
		
		Stream<Integer> intStream = Arrays.stream(intArray);

//		reduce(BiOperator<T> obj)
//		Optional<Integer> sum=intStream.reduce((no1,no2)->no1+no2);
//		
//		sum.ifPresent(e->System.out.println(e));
		
//		reduce(int intital, BiOperator<T> obj)
//		int sum=intStream.reduce(100,(no1,no2)->no1+no2);
//		
//		System.out.println(sum);
		
//		parrallel stream reduce(int inital, BiOperator<T> obj, BiOperator<T> accum)
//		int sum=intStream.reduce(100,(no1,no2)->no1+no2,(e1,e2)->e1+e2);
		
//		System.out.println(sum);
		
//		Optional<Integer> optRandom=intStream.findAny();
//		optRandom.ifPresent(e->System.out.println(e));
		
//		System.out.println(intStream.allMatch(e->e>5));
//		System.out.println(intStream.anyMatch(e->e>8));
		
//		collect() works with collection;
		
//		toArray();
//		Object[] objArray=intStream.filter(e->e%2==0).toArray();
		
//		Integer[] evenNumber=intStream.filter(e->e%2==0).toArray(Integer[]::new);
//		
//		System.out.println(Arrays.toString(evenNumber));
		
//		intStream.forEach(e->System.out.println(e*e));
		
		intStream.close();
	}
}
