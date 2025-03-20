package in.prec.java8features.functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainFunctionalInterfaces {
	// java.util.function
	public static void main(String[] args) {
//		Testable isEven = no-> no%2==0;
//		
//		Testable isGreaterThanTen = no-> no>10;
//		
//		if(isEven.test(3)) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
		
//		Predicate<T>
		
//		Predicate<String> isStrLengGreaterThanThree = o-> o.length()>3;
//		
//		System.out.println(isStrLengGreaterThanThree.test("ABC"));
		
//		Predicate<Integer> isEven = v -> v%2==0;
//		
//		System.out.println(isEven.test(122));
//		
//		Predicate<Integer> isPrime = n->{
//			
//			return false;
//		};
		
//		Predicate<String> lengthIsGreaterThan3 = str->str.length()>3;
//		Predicate<String> lengthIsEvenOdd = str->str.length()%2==0;
//		
//		Predicate<String> greaterThan3AndEven = lengthIsGreaterThan3
//														.or(lengthIsEvenOdd);
//		
//		System.out.println(greaterThan3AndEven.test("O"));
//		
//		Predicate<Integer> evenNumber = no->no%2==0;
		
//		Function<T,R>
		
//		Function<String, Integer> stringLength = str-> str.length();
//		System.out.println(stringLength.apply("Priti"));
//		
//		Function<String, String> stringUppercase = str->str.toUpperCase();
//		System.out.println(stringUppercase.apply("Nikita"));
		
//		Consumer<T>
		
//		Consumer<Integer> intPrinter = number->System.out.println(number);
//		
//		intPrinter.accept(100);
//		
//		Consumer<Integer> ageEvenOdd = 
//				number -> 
//					System.out.println((number%2==0)?"Even Age":"Odd Age");
//		
//		ageEvenOdd.accept(20);
		
//		Supplier<T>
		
//		Supplier<Integer> randomNumber = ()->(int) (Math.random()*100);
//		
//		for(int i=0;i<10;i++)
//			System.out.println(randomNumber.get());
	
//		BiConsumer<T,U>
		
//		BiConsumer<String, Integer> printNameAge= 
//				(name, age) -> System.out.println("Name: " + name + " Age: " + age);
//			
//				
//		printNameAge.accept("Sanika", 20);
		
//		BiFunction<T,U,R>
		
//		BiFunction<String, Integer, Integer> nameAgeSumation = 
//				(name, age)->name.length()+age;
//				
//		System.out.println(nameAgeSumation.apply("Nikita", 20));		
//		System.out.println(nameAgeSumation.apply("Priti", 20));		
		
//		BiPredicate<String,Integer> nameAgeOddEven = 
//				(str, no)->(str.length()+no)%2==0;
//		
//		if(nameAgeOddEven.test("Abc", 3))
//			System.out.println("sum of Length and number is even");
//		else
//			System.out.println("sum of Length and number is odd");
		
		UnaryOperator<Integer> square = no->no*no;
		
		System.out.println(square.apply(100));
	}
}
