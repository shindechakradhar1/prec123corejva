package in.prec.java8features.methodreferencing;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencingMain {

	public static void main(String[] args) {
//		Static method using :: operator
		
//		Supplier<Double> randomNumber = ()->Math.random();
//		Supplier<Double> randomNumber = Math::random;
//		
//		System.out.println(randomNumber.get());
		
		MethodReferencingMain obj = new MethodReferencingMain();
		
//		Consumer<Integer> printInteger = (e)->System.out.println(e);
//		Consumer<Integer> printInteger = System.out::println;
		
//		Consumer<Integer> printInteger = (e)->obj.print(e);
//		Consumer<Integer> printInteger = obj::print;
//		
//		printInteger.accept(10);
		
		
//		Supplier<MethodReferencingMain> getObject = ()->new MethodReferencingMain();
//		
//		Supplier<MethodReferencingMain> getObject = MethodReferencingMain::new;
//		
//		MethodReferencingMain demoObj=getObject.get();
		
		
//		Function<String, Integer> toLength = (e)->e.length();
		
//		Function<String, Integer> toLength = String::length;
		
		
//		Function<String, String> toUpperCase = e->e.toUpperCase();
		
		
		Function<String, String> toUpperCase = String::toUpperCase;
		
		System.out.println(toUpperCase.apply("abc"));
		
	}
	
	public void print(Integer variable) {
		System.out.println(variable);
	}
}
